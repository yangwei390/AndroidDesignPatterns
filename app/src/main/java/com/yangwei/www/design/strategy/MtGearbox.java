package com.yangwei.www.design.strategy;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description MtGearbox
 */
public class MtGearbox implements ICarGearbox {
    @Override
    public String createCarbox() {
        return "5MT变速箱";
    }
}
