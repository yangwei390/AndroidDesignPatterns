package com.yangwei.www.design.factory;


import com.yangwei.www.design.factory.Calculate;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description 加法计算
 */
public class AddCalculate extends Calculate {
    @Override
    public String getResult(int num1, int num2) {
        String str = String.valueOf(num1 + num2);
        return str;
    }
}
