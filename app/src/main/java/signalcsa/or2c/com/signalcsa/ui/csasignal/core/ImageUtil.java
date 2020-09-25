package signalcsa.or2c.com.signalcsa.ui.csasignal.core;

import android.graphics.Bitmap.Config;
import android.widget.ImageView;


import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import signalcsa.or2c.com.signalcsa.R;


public class ImageUtil {

    private static final DisplayImageOptions.Builder DEFAULT_DISPLAY_IMAGE_OPTIONS_BUIDLER = new DisplayImageOptions.Builder().imageScaleType(ImageScaleType.IN_SAMPLE_POWER_OF_2).displayer(new FadeInBitmapDisplayer(300, true, false, false)).showImageForEmptyUri((int) R.drawable.default_image).showImageOnLoading((int) R.drawable.default_image).showImageOnFail((int) R.drawable.default_image).cacheOnDisk(true).cacheInMemory(true).bitmapConfig(Config.ARGB_8888);
    private static final DisplayImageOptions DEFAULT_DISPLAY_IMAGE_OPTIONS = DEFAULT_DISPLAY_IMAGE_OPTIONS_BUIDLER.build();
    private static final DisplayImageOptions ROUND_DISPLAY_IMAGE_OPTIONS = DEFAULT_DISPLAY_IMAGE_OPTIONS_BUIDLER.displayer(new RoundedBitmapDisplayer(500)).build();


    public static void displayImage(ImageView imageView, String str, ImageLoadingListener imageLoadingListener) {
        ImageLoader instance = ImageLoader.getInstance();
        try {
            instance.displayImage(str, imageView, DEFAULT_DISPLAY_IMAGE_OPTIONS, imageLoadingListener);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            instance.clearMemoryCache();
        }
    }

    public static void displayRoundImage(ImageView imageView, String str, ImageLoadingListener imageLoadingListener) {
        ImageLoader instance = ImageLoader.getInstance();
        try {
            instance.displayImage(str, imageView, ROUND_DISPLAY_IMAGE_OPTIONS, imageLoadingListener);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            instance.clearMemoryCache();
        }
    }

    public static void loadImage(String str, ImageLoadingListener imageLoadingListener) {
        try {
            ImageLoader.getInstance().loadImage(str, DEFAULT_DISPLAY_IMAGE_OPTIONS, imageLoadingListener);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}
