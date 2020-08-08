package com.tcwong.pattern.adapter.poweradapter;

public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int output220V = ac220.output220V();
        int adapter5V = output220V / 44;
        System.out.println("电压适配器，由原来"+output220V+"伏转换成"+adapter5V+"伏");
        return adapter5V;
    }
}
