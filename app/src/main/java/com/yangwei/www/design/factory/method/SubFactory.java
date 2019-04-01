package com.yangwei.www.design.factory.method;

import com.yangwei.www.design.factory.Calculate;
import com.yangwei.www.design.factory.SubCalculate;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description SubFactory
 */
public class SubFactory implements IFactory {
    @Override
    public Calculate createCalculate() {
        SubCalculate subCalculate = new SubCalculate();
        return subCalculate;
    }
}
