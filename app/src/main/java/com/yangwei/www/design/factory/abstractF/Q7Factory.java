package com.yangwei.www.design.factory.abstractF;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description Q7Factory
 */
public class Q7Factory implements IAbsFactory {
    @Override
    public EngineWorkshop getEngineWorkshop() {
        return new Q7EngineWorkshop();
    }

    @Override
    public TireWorkshop getTireWorkshop() {
        return new Q7TireWorkshop();
    }
}
