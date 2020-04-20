package com.tcwong.pattern.principle.reuse;

public class BenzCarFactory implements CarFactory {
    @Override
    public String madeCar() {
        return "奔驰汽车";
    }
}
