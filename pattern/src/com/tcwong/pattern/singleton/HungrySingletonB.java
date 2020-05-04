package com.tcwong.pattern.singleton;


/**
 * 饿汉式
 */
public class HungrySingletonB {

    private static final HungrySingletonB INSTANCE ;

    static{
        INSTANCE = new HungrySingletonB();
    }

    private HungrySingletonB() {

    }

    public static HungrySingletonB getInstance() {
        return INSTANCE;
    }
}
