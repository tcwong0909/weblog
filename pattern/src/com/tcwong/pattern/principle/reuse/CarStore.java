package com.tcwong.pattern.principle.reuse;

public class CarStore {
    private CarFactory carFactory;

    public CarStore(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public void sellCar() {
        String s = carFactory.madeCar();
        System.out.println("售卖："+s);
    }
}
