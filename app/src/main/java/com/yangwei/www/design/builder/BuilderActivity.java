package com.yangwei.www.design.builder;

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
 * @Date 2019/4/1
 * @Description BuilderActivity
 */
public class BuilderActivity extends BaseActivity {

    @BindView(R.id.btn_builder)
    Button btnBuilder;
    @BindView(R.id.tv_text)
    TextView tvText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        initView();
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_builder)
    public void onViewClicked() {
        Q5Builder q5Builder = new Q5Builder();
        CarDirector carDirector = new CarDirector();
        carDirector.build(q5Builder);
        Car car = q5Builder.getCar();
        tvText.setText("建造模式\n" + car.getTire() + "\n" + car.getEngine() + "\n" + car.getGearbox());
    }
}
