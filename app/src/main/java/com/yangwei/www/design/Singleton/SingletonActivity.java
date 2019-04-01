package com.yangwei.www.design.Singleton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
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
 * @Description 单例
 */
public class SingletonActivity extends BaseActivity {
    @BindView(R.id.btn_hungry)
    Button btnHungry;
    @BindView(R.id.btn_lazy)
    Button btnLazy;
    @BindView(R.id.btn_double_check)
    Button btnDoubleCheck;
    @BindView(R.id.btn_internal_class)
    Button btnInternalClass;
    @BindView(R.id.btn_enum)
    Button btnEnum;
    @BindView(R.id.tv_text)
    TextView tvText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
        ButterKnife.bind(this);
        initView();
    }

    @Override
    protected void initView() {

    }

    @OnClick({R.id.btn_hungry, R.id.btn_lazy, R.id.btn_double_check, R.id.btn_internal_class, R.id.btn_enum})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_hungry:
                tvText.setText(HungrySingleton.getInstance().getName());
                break;
            case R.id.btn_lazy:
                tvText.setText(LazySingleton.getInstance().getName());
                break;
            case R.id.btn_double_check:
                tvText.setText(DoubleCheckSingleton.getInstance().getName());
                break;
            case R.id.btn_internal_class:
                tvText.setText(InternalClassSingleton.getInstance().getName());
                break;
            case R.id.btn_enum:
                tvText.setText(EnumSingleton.INSTANCE.getName());
                break;
        }
    }
}
