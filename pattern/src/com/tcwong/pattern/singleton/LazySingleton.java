package com.tcwong.pattern.singleton;

/**
 * 懒汉式
 */
public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    public LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
