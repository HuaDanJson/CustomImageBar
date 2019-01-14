package cool.customimagebar.android.fragment.one.two;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gyf.barlibrary.ImmersionBar;

import cool.customimagebar.android.R;
import cool.customimagebar.android.base.BaseFragment;

/**
 * @author geyifeng
 * @date 2017/7/20
 */

public class CategoryTwoFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two_category, container, false);
        return view;
    }


    @Override
    public void initImmersionBar() {
        super.initImmersionBar();
        ImmersionBar.with(this)
                .navigationBarColor(R.color.btn1)
                .init();
    }
}
