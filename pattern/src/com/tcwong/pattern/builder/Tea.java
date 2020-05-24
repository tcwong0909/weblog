package com.tcwong.pattern.builder;

public class Tea {

    private String teaSize;

    private String milkType;

    private String fruitType;

    private String teaType;

    public void setTeaSize(String teaSize) {
        this.teaSize = teaSize;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    @Override
    public String toString() {
        return "奶茶订单{" +
                "规格='" + teaSize + '\'' +
                ", 牛奶类型='" + milkType + '\'' +
                ", 水果类型='" + fruitType + '\'' +
                ", 茶底='" + teaType + '\'' +
                '}';
    }
}
