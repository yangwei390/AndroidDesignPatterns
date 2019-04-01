package com.yangwei.www.design.strategy;

/**
 * @author yangwei
 * @Date 2019/4/1
 * @Description TurboEngine
 */
public class TurboEngine implements ICarEngine {
    @Override
    public String createCarEngine() {
        return "涡轮增压发动机";
    }
}
