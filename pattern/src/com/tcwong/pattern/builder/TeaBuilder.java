package com.tcwong.pattern.builder;

public class TeaBuilder {

    private Tea tea;

    public TeaBuilder() {
        this.tea = new Tea();
    }


    public TeaBuilder addTeaSize(String teaSize) {
        if (teaSize == null) {
            teaSize = "中杯";
        }
        this.tea.setTeaSize(teaSize);
        return this;
    }

    public TeaBuilder addMilkType(String milkType) {
        if (milkType == null) {
            milkType = "鲜牛奶";
        }
        this.tea.setMilkType(milkType);
        return this;
    }

    public TeaBuilder addFruitType(String fruitType) {
        if (fruitType == null) {
            fruitType = "草莓";
        }
        this.tea.setFruitType(fruitType);
        return this;
    }

    public TeaBuilder addTeaType(String teaType) {
        if (teaType == null) {
            teaType = "龙井";
        }
        this.tea.setTeaType(teaType);
        return this;
    }

    public Tea build() {
        return tea;
    }

}
