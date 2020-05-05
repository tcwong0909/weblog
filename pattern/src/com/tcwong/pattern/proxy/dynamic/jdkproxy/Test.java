package com.tcwong.pattern.proxy.dynamic.jdkproxy;

import com.tcwong.pattern.proxy.Person;
import com.tcwong.pattern.proxy.statics.Renter;

public class Test {

    public static void main(String[] args) {
        Renter renter = new Renter();
        Person person = (Person) new AgencyJdkProxy().getInstance(renter);
        person.findHouse();
    }
}
