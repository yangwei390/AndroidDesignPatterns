package com.yangwei.www.design.proxy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yangwei.www.design.R;
import com.yangwei.www.design.base.BaseActivity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description 代理模式
 */
public class ProxyActivity extends BaseActivity {

    @BindView(R.id.btn_static)
    Button btnStatic;
    @BindView(R.id.btn_dynamic)
    Button btnDynamic;
    @BindView(R.id.tv_text)
    TextView tvText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        initView();
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_static, R.id.btn_dynamic})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_static:
                staticProxy();
                break;
            case R.id.btn_dynamic:
                dynamicProxy();
                break;
        }
    }

    private void dynamicProxy() {
        RealRequst realRequst = new RealRequst();
        InvocationHandler invocationHandler = new DynamicProxyRequst(realRequst);
        Class cls = realRequst.getClass();
        IRequstInterface iRequstInterface = (IRequstInterface) Proxy
                .newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), invocationHandler);
        tvText.setText(iRequstInterface.request());
    }

    private void staticProxy() {
        RealRequst realRequst = new RealRequst();
        StaticProxyRequst requst = new StaticProxyRequst(realRequst);
        tvText.setText(requst.request());
    }
}
