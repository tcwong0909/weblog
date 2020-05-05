package com.tcwong.pattern.proxy.statics;

import com.tcwong.pattern.proxy.Person;

public class AgencyStaticProxy  {

    private Person person;

    public AgencyStaticProxy(Person person) {
        this.person = person;
    }

    public void findHouse() {
        doBefore();
        person.findHouse();
        doAfter();
    }

    void doBefore() {
        System.out.println("请描述房子需求：静态代理");
    }

    void doAfter() {
        System.out.println("已成交，请支付中介费用2000元");
    }

}
