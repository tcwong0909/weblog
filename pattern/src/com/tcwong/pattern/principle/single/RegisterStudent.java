package com.tcwong.pattern.principle.single;

public class RegisterStudent {

    private static final Integer MAN = 0;
    private static final Integer WOMEN = 1;

    public void register(Integer sexNum) {
        if (MAN == sexNum) {
            System.out.println("记录姓名");
        } else if (WOMEN == sexNum) {
            System.out.println("记录姓名");
            System.out.println("记录联系人");
        }
    }
}
