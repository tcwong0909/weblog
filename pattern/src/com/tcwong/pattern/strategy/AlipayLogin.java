package com.tcwong.pattern.strategy;

public class AlipayLogin implements Login {
    @Override
    public String doLogin(String loginWay) {
        return "正在使用支付宝登陆";
    }
}
