package com.tcwong.pattern.templatemethod;

public class TaoBaoShopping extends DoShoppingOnlineTemplate implements DoShopping {

    @Override
    public void doShopping() {
        super.pay();
    }

    @Override
    protected void payType() {
        System.out.println("你已选用淘宝购物");
    }


}
