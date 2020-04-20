package com.tcwong.pattern.principle.reuse;

public class BWMCarFactory implements CarFactory {
    @Override
    public String madeCar() {
        return "宝马汽车";
    }
}
