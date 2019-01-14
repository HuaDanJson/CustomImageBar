package cool.customimagebar.android.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import cool.customimagebar.android.R;
import cool.customimagebar.android.base.BaseActivity;
import cool.customimagebar.android.fragment.one.CategoryOneFragment;
import cool.customimagebar.android.fragment.one.HomeOneFragment;
import cool.customimagebar.android.fragment.one.MineOneFragment;
import cool.customimagebar.android.fragment.one.ServiceOneFragment;
import cool.customimagebar.android.view.CustomViewPager;

public class ViewPagerActivity extends BaseActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    @BindView(R.id.viewPager) CustomViewPager viewPager;
    @BindView(R.id.ll_home) LinearLayout llHome;
    @BindView(R.id.ll_category) LinearLayout llCategory;
    @BindView(R.id.ll_service) LinearLayout llService;
    @BindView(R.id.ll_mine) LinearLayout llMine;
    @BindView(R.id.ll) LinearLayout ll;
    private ArrayList<Fragment> mFragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        ButterKnife.bind(this);
        initData();
    }

    protected void initData() {
        HomeOneFragment homeOneFragment = new HomeOneFragment();
        CategoryOneFragment categoryOneFragment = new CategoryOneFragment();
        ServiceOneFragment serviceOneFragment = new ServiceOneFragment();
        MineOneFragment mineOneFragment = new MineOneFragment();
        mFragments.add(homeOneFragment);
        mFragments.add(categoryOneFragment);
        mFragments.add(serviceOneFragment);
        mFragments.add(mineOneFragment);

        viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(3);
        llHome.setSelected(true);

        llHome.setOnClickListener(this);
        llCategory.setOnClickListener(this);
        llService.setOnClickListener(this);
        llMine.setOnClickListener(this);
        viewPager.addOnPageChangeListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_home:
                viewPager.setCurrentItem(0);
                tabSelected(llHome);
                break;
            case R.id.ll_category:
                viewPager.setCurrentItem(1);
                tabSelected(llCategory);
                break;
            case R.id.ll_service:
                viewPager.setCurrentItem(2);
                tabSelected(llService);
                break;
            case R.id.ll_mine:
                viewPager.setCurrentItem(3);
                tabSelected(llMine);
                break;
            default:
                break;
        }
    }

    private void tabSelected(LinearLayout linearLayout) {
        llHome.setSelected(false);
        llCategory.setSelected(false);
        llService.setSelected(false);
        llMine.setSelected(false);
        linearLayout.setSelected(true);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                tabSelected(llHome);
                break;
            case 1:
                tabSelected(llCategory);
                break;
            case 2:
                tabSelected(llService);
                break;
            case 3:
                tabSelected(llMine);
                break;
            default:
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    private class MyAdapter extends FragmentPagerAdapter {
        MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }
    }

}
