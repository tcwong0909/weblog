package com.tcwong.pattern.principle.openclose;

public class BenzReduceCar extends BenzCar {

    public BenzReduceCar(Integer price) {
        super(price);
    }

    @Override
    public int getPrice() {
        return super.getPrice()-10000;
    }
}
