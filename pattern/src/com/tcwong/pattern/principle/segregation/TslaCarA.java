package com.tcwong.pattern.principle.segregation;

public class TslaCarA implements BatteryCar {
    @Override
    public void run() {
        System.out.println("可以跑");
    }

    @Override
    public void battery() {
        System.out.println("充电");
    }
}
