package com.yangwei.www.design.Singleton;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description EnumSingleton
 */
public enum EnumSingleton {
    INSTANCE;

    public String getName() {
        return "这是枚举单例的写法";
    }
}
