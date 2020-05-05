package com.tcwong.pattern.proxy.dynamic.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AgencyCglibProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        doBefore();
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        doAfter();
        return invokeSuper ;
    }

    void doBefore() {
        System.out.println("请描述房子需求：Cglib动态代理");
    }

    void doAfter() {
        System.out.println("已成交，请支付中介费用2000元");
    }
}
