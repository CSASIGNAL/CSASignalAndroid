package signalcsa.or2c.com.signalcsa.ui.csasignal.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

import signalcsa.or2c.com.signalcsa.R;

/**
 * TODO: document your custom view class.
 */
public class MaterialDesignIconsTextView extends AppCompatTextView {
    private static Typeface sMaterialDesignIcons;

    public MaterialDesignIconsTextView(Context context) {
        this(context, null);
    }

    public MaterialDesignIconsTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialDesignIconsTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            setTypeface();
        }
    }

    private void setTypeface() {
        if (sMaterialDesignIcons == null) {
            sMaterialDesignIcons = Typeface.createFromAsset(getContext().getAssets(), "fonts/MaterialDesignIcons.ttf");
        }
        setTypeface(sMaterialDesignIcons);
    }
}
