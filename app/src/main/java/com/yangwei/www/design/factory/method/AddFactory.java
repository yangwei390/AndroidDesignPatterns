package com.yangwei.www.design.factory.method;

import com.yangwei.www.design.factory.AddCalculate;
import com.yangwei.www.design.factory.Calculate;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description AddFactory
 */
public class AddFactory implements IFactory {
    @Override
    public Calculate createCalculate() {
        AddCalculate addCalculate = new AddCalculate();
        return addCalculate;
    }
}
