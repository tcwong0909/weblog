package com.tcwong.pattern.templatemethod;

public abstract  class DoShoppingOnlineTemplate  {

    /**
     * 支付模板
     */
    protected void pay() {
        //确认购物车
        checkShoppingCart();
        //确认收货地址
        checkDeliveryAddress();
        //选择货物来源，由子类实现
        payType();
        //结束购物
        successShopping();
    }

    final void checkDeliveryAddress(){
        System.out.println("确认收货地址");
    };

    final void checkShoppingCart(){
        System.out.println("开始结算购物车");
    }

    protected void payType() {}

    final void successShopping() {
        System.out.println("订单已完成");
    }
}
