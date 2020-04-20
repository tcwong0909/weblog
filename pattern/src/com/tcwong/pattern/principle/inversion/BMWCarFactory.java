package com.tcwong.pattern.principle.inversion;

public class BMWCarFactory implements CarFactoryInterface {
    @Override
    public void madeCar() {
        System.out.println("可以造宝马汽车");
    }
}
