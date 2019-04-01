package com.yangwei.www.design.strategy;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description AtGearbox
 */
public class AtGearbox implements ICarGearbox {
    @Override
    public String createCarbox() {
        return "9AT变速箱";
    }
}
