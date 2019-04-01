package com.yangwei.www.design.builder;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description CarBuilder
 */
public abstract class CarBuilder {
    public abstract void buildTire();

    public abstract void buildEngine();

    public abstract void buildGearbox();

    public abstract Car getCar();
}
