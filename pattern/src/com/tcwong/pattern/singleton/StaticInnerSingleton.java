package com.tcwong.pattern.singleton;

/**
 * 静态内部类
 */
public class StaticInnerSingleton {

    public StaticInnerSingleton() {
    }

    public static StaticInnerSingleton getInstance() {
        return InnerClass.INSTANCE;
    }

    private static class InnerClass {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }
}
