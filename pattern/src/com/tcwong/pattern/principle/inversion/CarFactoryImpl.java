package com.tcwong.pattern.principle.inversion;

public class CarFactoryImpl {

    private CarFactoryInterface carFactoryInterface;

    public CarFactoryImpl(CarFactoryInterface carFactoryInterface) {
        this.carFactoryInterface = carFactoryInterface;
    }

    public void madeCar() {
        carFactoryInterface.madeCar();
    }
}
