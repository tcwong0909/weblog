package com.tcwong.pattern.adapter.poweradapter;

public class Test {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter(new AC220());
        System.out.println(powerAdapter.output5V());
    }
}
