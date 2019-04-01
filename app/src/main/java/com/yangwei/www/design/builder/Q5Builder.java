package com.yangwei.www.design.builder;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description Q5Builder
 */
public class Q5Builder extends CarBuilder {
    private Car car = new Car();

    @Override
    public void buildTire() {
        car.setTire("Q5轮胎");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Q5发动机");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("Q5变速箱");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
