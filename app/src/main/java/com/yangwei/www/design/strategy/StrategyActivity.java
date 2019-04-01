package com.yangwei.www.design.strategy;

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
 * @Description StrategyActivity
 */
public class StrategyActivity extends BaseActivity {

    @BindView(R.id.btn_strategy)
    Button btnStrategy;
    @BindView(R.id.tv_text)
    TextView tvText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strategy);
        initView();
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_strategy)
    public void onViewClicked() {
        TtCar ttCar = new TtCar();
        ttCar.setCarName("奥迪TT");
        ttCar.setiCarTire(new MqlTire());
        ttCar.setiCarEngine(new TurboEngine());
//        这里切换策略模式中的算法族
//        ttCar.setiCarGearbox(new AtGearbox());
        ttCar.setiCarGearbox(new MtGearbox());

        tvText.setText("策略模式组合算法\n" + ttCar.getCarName() +
                "\n" + ttCar.createCarTire() + "\n" + ttCar.createCarEngine() + "\n" + ttCar.createCarbox());
    }
}
