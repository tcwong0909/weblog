package com.tcwong.pattern.singleton;

/**
 * 枚举
 */
public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
