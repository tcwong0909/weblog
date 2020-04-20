package com.tcwong.pattern.principle.inversion;

public class AudiCarFactory implements CarFactoryInterface {
    @Override
    public void madeCar() {
        System.out.println("可以造奥迪汽车");
    }
}
