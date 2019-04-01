package com.yangwei.www.design.factory.easy;

import com.yangwei.www.design.factory.AddCalculate;
import com.yangwei.www.design.factory.Calculate;
import com.yangwei.www.design.factory.SubCalculate;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description 简单工厂，负责根据参数创建对象
 */
public class EasyFactory {
    public static Calculate getCalculate(TYPE type) {
        Calculate calculate = null;
        switch (type) {
            case ADD:
                calculate = new AddCalculate();
                break;
            case SUB:
                calculate = new SubCalculate();
        }
        return calculate;
    }

    public enum TYPE {
        ADD, SUB
    }
}
