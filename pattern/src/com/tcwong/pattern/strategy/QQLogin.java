package com.tcwong.pattern.strategy;

public class QQLogin implements Login {
    @Override
    public String doLogin(String loginWay) {
        return "正在使用QQ登陆";
    }
}
