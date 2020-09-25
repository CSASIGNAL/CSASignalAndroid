package signalcsa.or2c.com.signalcsa.ui.csasignal;


;


import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.nineoldandroids.animation.ObjectAnimator;


public class SwingBottomInAnimationAdapter extends SingleAnimationAdapter {
    private static final String TRANSLATION_Y = "translationY";

    public SwingBottomInAnimationAdapter(@NonNull BaseAdapter baseAdapter) {
        super(baseAdapter);
    }

    /* access modifiers changed from: protected */

    @NonNull
    public ObjectAnimator getAnimator(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return ObjectAnimator.ofFloat((Object) view, TRANSLATION_Y, (float) (viewGroup.getMeasuredHeight() >> 1), 0.0f);
    }
}
