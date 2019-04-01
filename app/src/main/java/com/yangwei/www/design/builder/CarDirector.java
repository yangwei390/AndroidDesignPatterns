package com.yangwei.www.design.builder;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description CarDirector
 */
public class CarDirector {
    public void build(CarBuilder builder) {
        builder.buildEngine();
        builder.buildGearbox();
        builder.buildTire();
    }
}
