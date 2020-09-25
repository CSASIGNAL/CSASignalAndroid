package signalcsa.or2c.com.signalcsa.ui.csasignal;



import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.nhaarman.listviewanimations.appearance.AnimationAdapter;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ObjectAnimator;


public abstract class SingleAnimationAdapter extends AnimationAdapter {
    /* access modifiers changed from: protected */
    @NonNull
    public abstract ObjectAnimator getAnimator(@NonNull ViewGroup viewGroup, @NonNull View view);

    protected SingleAnimationAdapter(@NonNull BaseAdapter baseAdapter) {
        super(baseAdapter);
    }

    @NonNull
    public Animator[] getAnimators(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return new Animator[]{getAnimator(viewGroup, view)};
    }
}
