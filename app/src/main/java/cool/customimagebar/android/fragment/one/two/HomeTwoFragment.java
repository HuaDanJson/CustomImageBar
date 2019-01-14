package cool.customimagebar.android.fragment.one.two;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cool.customimagebar.android.R;
import cool.customimagebar.android.base.BaseFragment;


/**
 * @author geyifeng
 * @date 2017/7/20
 */

public class HomeTwoFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two_home, container, false);
        return view;
    }

    @Override
    public void initImmersionBar() {
        super.initImmersionBar();
    }
}
