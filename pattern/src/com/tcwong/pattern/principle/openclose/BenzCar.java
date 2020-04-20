package com.tcwong.pattern.principle.openclose;

public class BenzCar implements Car{

    private Integer price;

    public BenzCar(Integer price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
