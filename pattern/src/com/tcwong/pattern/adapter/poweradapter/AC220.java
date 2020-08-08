package com.tcwong.pattern.adapter.poweradapter;

public class AC220 {

    public int output220V() {
        int output = 220;
        System.out.println("输出电压"+output+"伏");
        return output;
    }
}
