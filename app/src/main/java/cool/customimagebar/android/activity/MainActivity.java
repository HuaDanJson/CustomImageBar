package cool.customimagebar.android.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cool.customimagebar.android.R;
import cool.customimagebar.android.base.BaseActivity;

//https://github.com/gyf-dev/ImmersionBar
public class MainActivity extends BaseActivity {

    @BindView(R.id.tv1) TextView tv1;
    @BindView(R.id.rl_title) RelativeLayout rlTitle;
    @BindView(R.id.btn_show_fragment_main_activity) Button btnShowFragmentMainActivity;
    @BindView(R.id.btn_videwpage_fragment_main_activity) Button btnVidewpageFragmentMainActivity;
    @BindView(R.id.btn_text_chat_main_activity) Button btnTextChatMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_show_fragment_main_activity)
    public void toShowFragment() {
        startActivity(new Intent(this, HideFragmentActivity.class));
    }

    @OnClick(R.id.btn_videwpage_fragment_main_activity)
    public void toViewPagerFragment() {
        startActivity(new Intent(this, ViewPagerActivity.class));
    }

    @OnClick(R.id.btn_text_chat_main_activity)
    public void toInput() {
        startActivity(new Intent(this, TestActivity.class));
    }
}
