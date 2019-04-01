package com.yangwei.www.design.factory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.yangwei.www.design.R;
import com.yangwei.www.design.base.BaseActivity;
import com.yangwei.www.design.factory.abstractF.EngineWorkshop;
import com.yangwei.www.design.factory.abstractF.IAbsFactory;
import com.yangwei.www.design.factory.abstractF.Q5Factory;
import com.yangwei.www.design.factory.abstractF.Q7Factory;
import com.yangwei.www.design.factory.abstractF.TireWorkshop;
import com.yangwei.www.design.factory.easy.EasyFactory;
import com.yangwei.www.design.factory.method.IFactory;
import com.yangwei.www.design.factory.method.SubFactory;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description 工厂模式，包含：静态工厂、简单工厂、工厂方法、抽象工厂四种模式
 */
public class FactoryActivity extends BaseActivity {

    @BindView(R.id.btn_static)
    Button btnStatic;
    @BindView(R.id.btn_easy)
    Button btnEasy;
    @BindView(R.id.btn_method)
    Button btnMethod;
    @BindView(R.id.btn_abstract)
    Button btnAbstract;
    @BindView(R.id.tv_text)
    TextView tvText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        initView();
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_static, R.id.btn_easy, R.id.btn_method, R.id.btn_abstract})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_static:
                tvText.setText("最常见，类加静态方法，String.valueOf(),TextUtils.isEmpty()");
                break;
            case R.id.btn_easy:
                tvText.setText("创建一个类，专门来创建对象，根据参数的不同创建不同的对象，被创建的对象通常都是同一个类的子类，如果需要拓展的话，不符合开闭原则");
                easyFactort();
                break;
            case R.id.btn_method:
                tvText.setText("先定义一个工厂接口，然后各种工厂实现接口，处理业务时动态创建工厂，拓展时符合开闭原则");
                factoryMethod();
                break;
            case R.id.btn_abstract:
                tvText.setText("官方说法：提供一个创建一系列相关或相互依赖对象的接口，而无需制定他们具体的类\n" +
                        "个人理解：提供一个接口，用于创建相关的或依赖对象的家族，而不需要明确指定具体类，（接口包含多个方法）  当抽象工厂拓展时太复杂可改变为简单工厂，参见《大话数据模式》");
                abstractFactory();
                break;
        }
    }

    /**
     * 简单工厂使用
     */
    private void easyFactort() {
        int i = 1;
        int j = 1;
        Calculate calculate = EasyFactory.getCalculate(EasyFactory.TYPE.ADD);
//        Calculate calculate = EasyFactory.getCalculate(EasyFactory.TYPE.SUB);
        tvText.setText(tvText.getText() + "\n简单工厂使用结果:" + calculate.getResult(i, j) + "\n参见EasyFactory类");
    }

    /**
     * 工厂方法使用
     */
    private void factoryMethod() {
        int i = 1;
        int j = 1;
//        IFactory factory = new AddFactory();
        IFactory factory = new SubFactory();
        Calculate calculate = factory.createCalculate();
        tvText.setText(tvText.getText() + "\n工厂方法使用结果:" + calculate.getResult(i, j) + "\n拓展时创建新的factory类，实现IFactory即可");
    }

    /**
     * 抽象工厂方法使用
     */
    private void abstractFactory() {
//        IAbsFactory factory = new Q5Factory();
        IAbsFactory factory = new Q7Factory();
        EngineWorkshop engineWorkshop = factory.getEngineWorkshop();
        TireWorkshop tireWorkshop = factory.getTireWorkshop();
        tvText.setText(tvText.getText() + "\n抽象工厂方法使用结果" + engineWorkshop.produceEngine() + " " + tireWorkshop.produceTire() +
                "\n拓展时创建新的factory类，实现IAbsFactory即可");
    }
}
