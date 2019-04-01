package com.yangwei.www.design;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description 实用与对象有多个属性时，创建对象的方法
 */
public class Car {
    private String tire;
    private String engine;
    private String gearbox;

    private Car(Builder builder) {
        this.tire = builder.tire;
        this.engine = builder.engine;
        this.gearbox = builder.gearbox;
    }

    public static class Builder {
        private String tire;
        private String engine;
        private String gearbox;

        public Builder setTire(String tire) {
            this.tire = tire;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setGearbox(String gearbox) {
            this.gearbox = gearbox;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
