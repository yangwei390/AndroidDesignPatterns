package com.yangwei.www.design.Singleton;

/**
 * @author yangwei
 * @Date 2019/3/29
 * @Description LazySingleton
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }

    //  线程不安全的写法
//    public static LazySingleton getInstance() {
//        if (lazySingleton == null) {
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    //    线程安全的写法(效率低不推荐使用)
    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public String getName() {
        return "这是懒汉式的写法，含线程安全和不安全两种方式";
    }
}
