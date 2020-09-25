package signalcsa.or2c.com.signalcsa.ui.csasignal;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import signalcsa.or2c.com.signalcsa.R;

public class CsaSignalFragment extends Fragment {

    private CsaSignalViewModel mViewModel;

    public static CsaSignalFragment newInstance() {
        return new CsaSignalFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.csa_signal_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(CsaSignalViewModel.class);
        // TODO: Use the ViewModel
    }

}
