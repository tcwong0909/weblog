package com.tcwong.pattern.strategy;

public class Test {

    public static void main(String[] args) {
        LoginStrategy loginStrategy = new LoginStrategy();
        loginStrategy.doLogin(LoginStrategy.ALIPAY);
        loginStrategy.doLogin(LoginStrategy.WECHAT);
    }
}
