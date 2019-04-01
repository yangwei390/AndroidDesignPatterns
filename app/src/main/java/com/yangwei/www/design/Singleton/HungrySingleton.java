package com.yangwei.www.design.Singleton;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description HungrySingleton
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    public String getName() {
        return "这是恶汉式的写法";
    }
}
