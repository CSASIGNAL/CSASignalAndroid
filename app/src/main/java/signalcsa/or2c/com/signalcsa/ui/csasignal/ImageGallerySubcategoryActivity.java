package signalcsa.or2c.com.signalcsa.ui.csasignal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import signalcsa.or2c.com.signalcsa.R;
import signalcsa.or2c.com.signalcsa.ui.csasignal.animator.ImageGallerySubcategoryModel;
//import signalcsa.or2c.com.signalcsa.ui.csasignal.animator.ImageGallerySubcategoryModel;

public class ImageGallerySubcategoryActivity extends AppCompatActivity {
    public static final String IMAGE_GALLERY_LAYOUT_ON_TOP = "com.csform.android.uiapptemplate.ImageGallerySubcategoryActivity.layoutOnTop";
    public static final String IMAGE_GALLERY_SUBCATEGORY = "com.csform.android.uiapptemplate.ImageGallerySubcategoryActivity";
    private boolean mIsLayoutOnTop;
    private ListView mListView;
    private ArrayList<ImageGallerySubcategoryModel> mSubcategories;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.list_view);
        this.mListView = (ListView) findViewById(R.id.list_view);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (extras.containsKey(IMAGE_GALLERY_SUBCATEGORY)) {
                this.mSubcategories = extras.getParcelableArrayList(IMAGE_GALLERY_SUBCATEGORY);
            } else {
                this.mSubcategories = new ArrayList<>();
            }
            if (extras.containsKey(IMAGE_GALLERY_LAYOUT_ON_TOP)) {
                this.mIsLayoutOnTop = extras.getBoolean(IMAGE_GALLERY_LAYOUT_ON_TOP, false);
            }
        }
        setAdapter();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    private void setAdapter() {
        this.mListView.setAdapter(new ImageGallerySubcategoryAdapter(this, this.mSubcategories, this.mIsLayoutOnTop));
    }
}
