package com.tcwong.pattern.proxy.dynamic.jdkproxy;

import com.tcwong.pattern.proxy.Person;
import com.tcwong.pattern.proxy.statics.Renter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AgencyJdkProxy implements InvocationHandler {

    private Object object;

    public Object getInstance(Object target) {
        this.object = target;
        Class<?> clazz = object.getClass();
        Object o = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
        return o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        doBefore();
        Object invoke = method.invoke(this.object, args);
        doAfter();
        return invoke;
    }

    void doBefore() {
        System.out.println("请描述房子需求：JDK动态代理");
    }

    void doAfter() {
        System.out.println("已成交，请支付中介费用2000元");
    }

}
