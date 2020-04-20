package com.tcwong.pattern.principle.inversion;

public class BenzCarFactory implements CarFactoryInterface {
    @Override
    public void madeCar() {
        System.out.println("可以造奔驰汽车");
    }
}
