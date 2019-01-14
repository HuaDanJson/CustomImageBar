package cool.customimagebar.android.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import cool.customimagebar.android.R;
import cool.customimagebar.android.base.BaseActivity;
import cool.customimagebar.android.fragment.one.two.CategoryTwoFragment;
import cool.customimagebar.android.fragment.one.two.HomeTwoFragment;
import cool.customimagebar.android.fragment.one.two.MineTwoFragment;
import cool.customimagebar.android.fragment.one.two.ServiceTwoFragment;

public class HideFragmentActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.content)
    FrameLayout content;
    @BindView(R.id.ll_home)
    LinearLayout llHome;
    @BindView(R.id.ll_category)
    LinearLayout llCategory;
    @BindView(R.id.ll_service)
    LinearLayout llService;
    @BindView(R.id.ll_mine)
    LinearLayout llMine;
    private HomeTwoFragment homeTwoFragment;
    private CategoryTwoFragment categoryTwoFragment;
    private ServiceTwoFragment serviceTwoFragment;
    private MineTwoFragment mineTwoFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_hide_fragmenmt);
        ButterKnife.bind(this);

        selectedFragment(0);
        tabSelected(llHome);

        llHome.setOnClickListener(this);
        llCategory.setOnClickListener(this);
        llService.setOnClickListener(this);
        llMine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_home:
                selectedFragment(0);
                tabSelected(llHome);
                break;
            case R.id.ll_category:
                selectedFragment(1);
                tabSelected(llCategory);
                break;
            case R.id.ll_service:
                selectedFragment(2);
                tabSelected(llService);
                break;
            case R.id.ll_mine:
                selectedFragment(3);
                tabSelected(llMine);
                break;
            default:
                break;
        }
    }

    private void selectedFragment(int position) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        hideFragment(transaction);
        switch (position) {
            case 0:
                if (homeTwoFragment == null) {
                    homeTwoFragment = new HomeTwoFragment();
                    transaction.add(R.id.content, homeTwoFragment);
                } else {
                    transaction.show(homeTwoFragment);
                }
                break;
            case 1:
                if (categoryTwoFragment == null) {
                    categoryTwoFragment = new CategoryTwoFragment();
                    transaction.add(R.id.content, categoryTwoFragment);
                } else {
                    transaction.show(categoryTwoFragment);
                }
                break;
            case 2:
                if (serviceTwoFragment == null) {
                    serviceTwoFragment = new ServiceTwoFragment();
                    transaction.add(R.id.content, serviceTwoFragment);
                } else {
                    transaction.show(serviceTwoFragment);
                }
                break;
            case 3:
                if (mineTwoFragment == null) {
                    mineTwoFragment = new MineTwoFragment();
                    transaction.add(R.id.content, mineTwoFragment);
                } else {
                    transaction.show(mineTwoFragment);
                }
                break;
            default:
                break;
        }
        transaction.commit();
    }

    private void hideFragment(FragmentTransaction transaction) {
        if (homeTwoFragment != null) {
            transaction.hide(homeTwoFragment);
        }
        if (categoryTwoFragment != null) {
            transaction.hide(categoryTwoFragment);
        }
        if (serviceTwoFragment != null) {
            transaction.hide(serviceTwoFragment);
        }
        if (mineTwoFragment != null) {
            transaction.hide(mineTwoFragment);
        }
    }

    private void tabSelected(LinearLayout linearLayout) {
        llHome.setSelected(false);
        llCategory.setSelected(false);
        llService.setSelected(false);
        llMine.setSelected(false);
        linearLayout.setSelected(true);
    }

}
