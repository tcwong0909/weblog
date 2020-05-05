package com.tcwong.pattern.proxy.statics;

import com.tcwong.pattern.proxy.Person;

public class Renter implements Person {

    @Override
    public void findHouse() {
        System.out.println("三室两厅");
        System.out.println("交通方便");
    }

}
