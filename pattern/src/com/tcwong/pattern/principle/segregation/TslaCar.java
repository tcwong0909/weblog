package com.tcwong.pattern.principle.segregation;

public class TslaCar implements Car {
    @Override
    public void run() {
        System.out.println("可以跑");
    }

    @Override
    public void gas() {

    }

    @Override
    public void battery() {
        System.out.println("充电");
    }
}
