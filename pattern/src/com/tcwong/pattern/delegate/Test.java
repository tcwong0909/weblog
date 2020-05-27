package com.tcwong.pattern.delegate;

public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.command("服务器");
    }
}
