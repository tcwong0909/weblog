package com.tcwong.pattern.strategy;

public class WeChatLogin implements Login {
    @Override
    public String doLogin(String loginWay) {
        return "正在使用微信登陆";
    }
}
