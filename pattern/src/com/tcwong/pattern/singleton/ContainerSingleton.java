package com.tcwong.pattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器式
 */
public class ContainerSingleton {

    public ContainerSingleton() {
    }

    private static Map<String, Object> IOC = new ConcurrentHashMap<>();

    public static Object getBean(String className) {
        synchronized (IOC) {
            if (!IOC.containsKey(className)) {
                try {
                    Class<?> aClass = Class.forName(className);
                    Object o = aClass.newInstance();
                    IOC.put(className, o);
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return IOC.get(className);
    }
}
