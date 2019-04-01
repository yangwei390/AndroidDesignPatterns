package com.yangwei.www.design.Singleton;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description InternalClassSingleton
 */
public class InternalClassSingleton {
    private InternalClassSingleton() {
    }

    private static class InternalClassSingletonHolder {
        private static InternalClassSingleton internalClassSingleton = new InternalClassSingleton();
    }

    public static InternalClassSingleton getInstance() {
        return InternalClassSingletonHolder.internalClassSingleton;
    }

    public String getName() {
        return "这是静态内部类的写法";
    }
}
