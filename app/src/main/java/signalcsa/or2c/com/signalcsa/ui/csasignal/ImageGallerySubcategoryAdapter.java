package signalcsa.or2c.com.signalcsa.ui.csasignal;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;


import java.util.ArrayList;

import signalcsa.or2c.com.signalcsa.R;
import signalcsa.or2c.com.signalcsa.ui.csasignal.animator.ImageGallerySubcategoryModel;
import signalcsa.or2c.com.signalcsa.ui.csasignal.core.ImageUtil;

/*import signalcsa.or2c.com.signalcsa.ui.csasignal.animator.ImageGallerySubcategoryModel;
import signalcsa.or2c.com.signalcsa.ui.csasignal.core.ImageUtil;
*/
public class ImageGallerySubcategoryAdapter extends BaseAdapter {
    private static final int TYPE_MAX_COUNT = 2;
    private static final int TYPE_ONE_COLUMN = 0;
    private static final int TYPE_TWO_COLUMNS = 1;
    private ArrayList<ImageGallerySubcategoryModel> mImageGallerySubcategories;
    private LayoutInflater mInflater;
    private final boolean mIsLayoutOnTop;

    private static class ViewHolder {

        public static class OneColumnViewHolder {
            public ImageView image1;
            public ViewGroup layoutTopBottom1;
            public TextView numberOfImages1;
            public TextView title1;
        }

        private static class TwoColumnsViewHolder {
            public ImageView image1;
            public ImageView image2;
            public ViewGroup layoutTopBottom1;
            public ViewGroup layoutTopBottom2;
            public TextView numberOfImages1;
            public TextView numberOfImages2;
            public TextView title1;
            public TextView title2;

            private TwoColumnsViewHolder() {
            }
        }

        private ViewHolder() {
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 2;
    }

    public ImageGallerySubcategoryAdapter(Context context, ArrayList<ImageGallerySubcategoryModel> arrayList, boolean z) {
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        this.mImageGallerySubcategories = arrayList;
        this.mIsLayoutOnTop = z;
    }

    public int getItemViewType(int i) {
        if (i == this.mImageGallerySubcategories.size() / 2 && this.mImageGallerySubcategories.size() % 2 == 1) {
            return 0;
        }
        return 1;
    }

    public int getCount() {
        return (this.mImageGallerySubcategories.size() / 2) + (this.mImageGallerySubcategories.size() % 2);
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder.TwoColumnsViewHolder twoColumnsViewHolder;
        ViewHolder.OneColumnViewHolder oneColumnViewHolder;
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            if (view == null) {
                view = this.mInflater.inflate(R.layout.list_item_categories_one_column, viewGroup, false);
                oneColumnViewHolder = new ViewHolder.OneColumnViewHolder();
                oneColumnViewHolder.image1 = (ImageView) view.findViewById(R.id.list_item_image_1);
                oneColumnViewHolder.title1 = (TextView) view.findViewById(R.id.list_item_title_1);
                oneColumnViewHolder.numberOfImages1 = (TextView) view.findViewById(R.id.list_item_number_of_images_1);
                oneColumnViewHolder.layoutTopBottom1 = (ViewGroup) view.findViewById(R.id.layout_top_bottom_1);
                view.setTag(oneColumnViewHolder);
            } else {
                oneColumnViewHolder = (ViewHolder.OneColumnViewHolder) view.getTag();
            }
            ImageGallerySubcategoryModel imageGallerySubcategoryModel = (ImageGallerySubcategoryModel) this.mImageGallerySubcategories.get(i * 2);
            if (TextUtils.isEmpty(imageGallerySubcategoryModel.getTitle())) {
                oneColumnViewHolder.layoutTopBottom1.setVisibility(8);
            } else {
                oneColumnViewHolder.title1.setText(imageGallerySubcategoryModel.getTitle());
            }
            ImageUtil.displayImage(oneColumnViewHolder.image1, imageGallerySubcategoryModel.getUrl(), null);
            oneColumnViewHolder.image1.setTag(Integer.valueOf(i));
            oneColumnViewHolder.numberOfImages1.setVisibility(8);
            LayoutParams layoutParams = (LayoutParams) oneColumnViewHolder.layoutTopBottom1.getLayoutParams();
            if (!this.mIsLayoutOnTop) {
                layoutParams.addRule(12, -1);
            } else {
                layoutParams.addRule(12, 0);
            }
        } else if (itemViewType == 1) {
            if (view == null) {
                view = this.mInflater.inflate(R.layout.list_item_categories_two_columns, viewGroup, false);
                twoColumnsViewHolder = new ViewHolder.TwoColumnsViewHolder();
                twoColumnsViewHolder.image1 = (ImageView) view.findViewById(R.id.list_item_image_1);
                twoColumnsViewHolder.title1 = (TextView) view.findViewById(R.id.list_item_title_1);
                twoColumnsViewHolder.numberOfImages1 = (TextView) view.findViewById(R.id.list_item_number_of_images_1);
                twoColumnsViewHolder.layoutTopBottom1 = (ViewGroup) view.findViewById(R.id.layout_top_bottom_1);
                twoColumnsViewHolder.image2 = (ImageView) view.findViewById(R.id.list_item_image_2);
                twoColumnsViewHolder.title2 = (TextView) view.findViewById(R.id.list_item_title_2);
                twoColumnsViewHolder.numberOfImages2 = (TextView) view.findViewById(R.id.list_item_number_of_images_2);
                twoColumnsViewHolder.layoutTopBottom2 = (ViewGroup) view.findViewById(R.id.layout_top_bottom_2);
                view.setTag(twoColumnsViewHolder);
            } else {
                twoColumnsViewHolder = (ViewHolder.TwoColumnsViewHolder) view.getTag();
            }
            int i2 = i * 2;
            ImageGallerySubcategoryModel imageGallerySubcategoryModel2 = (ImageGallerySubcategoryModel) this.mImageGallerySubcategories.get(i2);
            if (TextUtils.isEmpty(imageGallerySubcategoryModel2.getTitle())) {
                twoColumnsViewHolder.layoutTopBottom1.setVisibility(8);
            } else {
                twoColumnsViewHolder.title1.setText(imageGallerySubcategoryModel2.getTitle());
            }
            ImageUtil.displayImage(twoColumnsViewHolder.image1, imageGallerySubcategoryModel2.getUrl(), null);
            ImageGallerySubcategoryModel imageGallerySubcategoryModel3 = (ImageGallerySubcategoryModel) this.mImageGallerySubcategories.get(i2 + 1);
            if (TextUtils.isEmpty(imageGallerySubcategoryModel3.getTitle())) {
                twoColumnsViewHolder.layoutTopBottom2.setVisibility(8);
            } else {
                twoColumnsViewHolder.title2.setText(imageGallerySubcategoryModel3.getTitle());
            }
            ImageUtil.displayImage(twoColumnsViewHolder.image2, imageGallerySubcategoryModel3.getUrl(), null);
            twoColumnsViewHolder.image1.setTag(Integer.valueOf(i));
            twoColumnsViewHolder.image2.setTag(Integer.valueOf(i));
            twoColumnsViewHolder.numberOfImages1.setVisibility(8);
            twoColumnsViewHolder.numberOfImages2.setVisibility(8);
            LayoutParams layoutParams2 = (LayoutParams) twoColumnsViewHolder.layoutTopBottom1.getLayoutParams();
            LayoutParams layoutParams3 = (LayoutParams) twoColumnsViewHolder.layoutTopBottom2.getLayoutParams();
            if (!this.mIsLayoutOnTop) {
                layoutParams2.addRule(12, -1);
                layoutParams3.addRule(12, -1);
            } else {
                layoutParams2.addRule(12, 0);
                layoutParams3.addRule(12, 0);
            }
        }
        return view;
    }
}
