package com.tcwong.pattern.singleton;

/**
 * 双重检锁式
 */
public class DoubleCheckSingleton {
    private static volatile DoubleCheckSingleton INSTANCE = null;

    public DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
