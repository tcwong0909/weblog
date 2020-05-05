package com.tcwong.pattern.proxy.dynamic.cglibproxy;

public class Test {

    public static void main(String[] args) {
        RenterOnly renterOnly = (RenterOnly)new AgencyCglibProxy().getInstance(RenterOnly.class);
        renterOnly.findHouse();
    }
}
