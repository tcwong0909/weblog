package com.tcwong.pattern.templatemethod;

public class Test {
    public static void main(String[] args) {
        ShoppingOnlineFactory shoppingOnlineFactory = new ShoppingOnlineFactory();
        shoppingOnlineFactory.getShoppingLine(ShoppingOnlineFactory.DANGDANG).doShopping();
        shoppingOnlineFactory.getShoppingLine(ShoppingOnlineFactory.TAOBAO).doShopping();
    }
}
