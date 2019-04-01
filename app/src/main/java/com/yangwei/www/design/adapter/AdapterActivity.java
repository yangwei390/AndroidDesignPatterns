package com.yangwei.www.design.adapter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.TextView;

import com.yangwei.www.design.R;
import com.yangwei.www.design.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description AdapterActivity
 */
public class AdapterActivity extends BaseActivity {

    @BindView(R.id.btn_adapter)
    Button btnAdapter;
    @BindView(R.id.tv_text)
    TextView tvText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        initView();
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_adapter)
    public void onViewClicked() {
        HongKongSocketInterface hongKongSocketInterface = new SocketAdapter(new GbSocket());
//        HongKongSocketInterface hongKongSocketInterface = new HongKongSocket();
        Plug plug = new Plug(new SocketAdapter(new GbSocket()));
        tvText.setText(plug.getSocket());
    }
}
