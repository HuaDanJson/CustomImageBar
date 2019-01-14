package cool.customimagebar.android.activity;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.gyf.barlibrary.ImmersionBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import cool.customimagebar.android.R;
import cool.customimagebar.android.base.BaseActivity;

public class TestActivity extends BaseActivity {

    @BindView(R.id.tv1) TextView tv1;
    @BindView(R.id.rl_title) RelativeLayout rlTitle;
    @BindView(R.id.rlv_test) RecyclerView rlvTest;
    @BindView(R.id.edt_text) EditText edtText;
    @BindView(R.id.btn_send) Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        ImmersionBar.with(this).keyboardEnable(true).init();
    }
}
