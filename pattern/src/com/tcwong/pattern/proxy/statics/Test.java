package com.tcwong.pattern.proxy.statics;

public class Test {

    public static void main(String[] args) {
        AgencyStaticProxy agency = new AgencyStaticProxy(new Renter());
        agency.findHouse();
    }
}
