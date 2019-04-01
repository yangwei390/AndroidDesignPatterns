package com.yangwei.www.design;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yangwei.www.design.Singleton.SingletonActivity;
import com.yangwei.www.design.adapter.AdapterActivity;
import com.yangwei.www.design.base.BaseActivity;
import com.yangwei.www.design.builder.BuilderActivity;
import com.yangwei.www.design.factory.FactoryActivity;
import com.yangwei.www.design.proxy.ProxyActivity;
import com.yangwei.www.design.strategy.StrategyActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.btn_factory)
    Button btnFactory;
    @BindView(R.id.btn_sigleton)
    Button btnSigleton;
    @BindView(R.id.btn_adapter)
    Button btnAdapter;
    @BindView(R.id.btn_observer)
    Button btnObserver;
    @BindView(R.id.btn_proxy)
    Button btnProxy;
    @BindView(R.id.btn_duilder)
    Button btnDuilder;
    @BindView(R.id.btn_strategy)
    Button btnStrategy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    @OnClick({R.id.btn_factory, R.id.btn_sigleton, R.id.btn_adapter, R.id.btn_observer, R.id.btn_proxy, R.id.btn_duilder, R.id.btn_strategy})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_factory:
                goPage(FactoryActivity.class);
                break;
            case R.id.btn_sigleton:
                goPage(SingletonActivity.class);
                break;
            case R.id.btn_adapter:
                goPage(AdapterActivity.class);
                break;
            case R.id.btn_observer:
                break;
            case R.id.btn_proxy:
                goPage(ProxyActivity.class);
                break;
            case R.id.btn_duilder:
                goPage(BuilderActivity.class);
                break;
            case R.id.btn_strategy:
                goPage(StrategyActivity.class);
                break;
        }
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
    }

}
