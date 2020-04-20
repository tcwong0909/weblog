package com.tcwong.pattern.principle.segregation;

public class BYDCar implements Car {
    @Override
    public void run() {
        System.out.println("可以跑");
    }

    @Override
    public void gas() {
        System.out.println("烧汽油");
    }

    @Override
    public void battery() {
        System.out.println("充电");
    }
}
