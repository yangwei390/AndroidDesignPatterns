package com.yangwei.www.design.factory.abstractF;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description IAbsFactory
 */
public interface IAbsFactory {
    EngineWorkshop getEngineWorkshop();

    TireWorkshop getTireWorkshop();
}
