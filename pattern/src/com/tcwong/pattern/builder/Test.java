package com.tcwong.pattern.builder;

public class Test {

    public static void main(String[] args) {
        TeaBuilder teaBuilder = new TeaBuilder();
        teaBuilder.addFruitType("火龙果")
                .addMilkType("酸奶")
                .addTeaSize(null)
                .addTeaType("红茶");

        System.out.println(teaBuilder.build());
    }
}
