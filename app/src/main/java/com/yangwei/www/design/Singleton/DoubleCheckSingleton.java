package com.yangwei.www.design.Singleton;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description DoubleCheckSingleton
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton doubleCheckSingleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

    public String getName() {
        return "这是双重校验锁的写法";
    }
}
