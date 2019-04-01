package com.yangwei.www.design.factory.method;

import com.yangwei.www.design.factory.Calculate;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description 总的工厂方法接口
 */
public interface IFactory {
    Calculate createCalculate();
}
