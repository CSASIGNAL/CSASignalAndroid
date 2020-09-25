package signalcsa.or2c.com.signalcsa;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.nhaarman.listviewanimations.appearance.simple.SwingBottomInAnimationAdapter;
import com.nhaarman.listviewanimations.itemmanipulation.swipedismiss.OnDismissCallback;
import com.nhaarman.listviewanimations.itemmanipulation.swipedismiss.SwipeDismissAdapter;

import signalcsa.or2c.com.signalcsa.ui.csasignal.CsaSignalCardsMediaAdapter;
import signalcsa.or2c.com.signalcsa.ui.csasignal.animator.DummyContent;



public class CsaSignal extends AppCompatActivity implements OnDismissCallback {

    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int INITIAL_DELAY_MILLIS = 300;
    private CsaSignalCardsMediaAdapter csaSignalCardsAdapter;

    final Gson gson = new GsonBuilder().serializeNulls().create();


    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        /*getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.drawable.csa_launcher_web);*/
        setContentView((int) R.layout.list_view);
        ListView listView = (ListView) findViewById(R.id.list_view);
        //listView.setBackgroundResource(R.drawable.background_media);
        listView.setBackgroundResource(R.drawable.background_csa_opacity2);
        //listView.getBackground().setAlpha(51);
        String data = getIntent().getStringExtra("data");
        ValueRange result = gson.fromJson(data,ValueRange.class);
        //this.csaSignalCardsAdapter = new CsaSignalCardsMediaAdapter(this, DummyContent.getDummyModelList());
        this.csaSignalCardsAdapter = new CsaSignalCardsMediaAdapter(this, result.getValues().subList(1,result.getValues().size()),data);


        SwingBottomInAnimationAdapter swingBottomInAnimationAdapter = new SwingBottomInAnimationAdapter(new SwipeDismissAdapter(this.csaSignalCardsAdapter, this));
        swingBottomInAnimationAdapter.setAbsListView(listView);
        swingBottomInAnimationAdapter.getViewAnimator().setInitialDelayMillis(INITIAL_DELAY_MILLIS);
        listView.setClipToPadding(false);
        listView.setDivider(null);
        Resources resources = getResources();
        listView.setDividerHeight((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        listView.setFadingEdgeLength(0);
        listView.setFitsSystemWindows(true);
        int applyDimension = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        listView.setPadding(applyDimension, applyDimension, applyDimension, applyDimension);
        listView.setScrollBarStyle(33554432);
        listView.setAdapter(swingBottomInAnimationAdapter);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //getSupportActionBar().setTitle((CharSequence) "Google cards media");

        //this.csaSignalCardsAdapter.onClick(new );
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public void onDismiss(@NonNull ViewGroup viewGroup, @NonNull int[] iArr) {
        for (int item : iArr) {
            this.csaSignalCardsAdapter.remove(this.csaSignalCardsAdapter.getItem(item));
        }
    }
}
