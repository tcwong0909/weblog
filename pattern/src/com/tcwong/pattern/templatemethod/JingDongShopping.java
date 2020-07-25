package com.tcwong.pattern.templatemethod;

public class JingDongShopping extends DoShoppingOnlineTemplate implements DoShopping {

    @Override
    public void doShopping() {
        super.pay();
    }

    @Override
    protected void payType() {
        System.out.println("你已选用京东购物");
    }


}
