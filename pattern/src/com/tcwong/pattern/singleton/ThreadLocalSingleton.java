package com.tcwong.pattern.singleton;

/**
 * 本地线程
 */
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>() {
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }

    };

    public static ThreadLocalSingleton getInstance() {
        return threadLocal.get();
    }
}
