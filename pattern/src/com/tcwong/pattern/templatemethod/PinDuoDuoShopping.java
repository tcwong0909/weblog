package com.tcwong.pattern.templatemethod;

public class PinDuoDuoShopping extends DoShoppingOnlineTemplate implements DoShopping {

    @Override
    public void doShopping() {
        super.pay();
    }

    @Override
    protected void payType() {
        System.out.println("你已选用拼多多购物");
    }


}
