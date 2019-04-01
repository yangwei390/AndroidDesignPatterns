package com.yangwei.www.design.factory.abstractF;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description Q5Factory
 */
public class Q5Factory implements IAbsFactory {
    @Override
    public EngineWorkshop getEngineWorkshop() {
        return new Q5EngineWorkshop();
    }

    @Override
    public TireWorkshop getTireWorkshop() {
        return new Q5TireWorkshop();
    }
}
