package com.yangwei.www.design.strategy;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description CustomCar
 */
public abstract class CustomCar {
    protected String carName;
    protected ICarTire iCarTire;
    protected ICarEngine iCarEngine;
    protected ICarGearbox iCarGearbox;

    public CustomCar setCarName(String carName) {
        this.carName = carName;
        return this;
    }

    public CustomCar setiCarTire(ICarTire iCarTire) {
        this.iCarTire = iCarTire;
        return this;
    }

    public CustomCar setiCarEngine(ICarEngine iCarEngine) {
        this.iCarEngine = iCarEngine;
        return this;
    }

    public CustomCar setiCarGearbox(ICarGearbox iCarGearbox) {
        this.iCarGearbox = iCarGearbox;
        return this;
    }

    protected String getCarName() {
        return carName;
    }

    protected String createCarTire() {
        return iCarTire.createCarTire();
    }

    protected String createCarEngine() {
        return iCarEngine.createCarEngine();
    }

    protected String createCarbox() {
        return iCarGearbox.createCarbox();
    }
}
