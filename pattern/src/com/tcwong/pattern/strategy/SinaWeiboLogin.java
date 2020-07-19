package com.tcwong.pattern.strategy;

public class SinaWeiboLogin implements Login {
    @Override
    public String doLogin(String loginWay) {
        return "正在使用新浪微博登陆";
    }
}
