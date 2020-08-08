package com.tcwong.pattern.adapter.v1;

public class LoginForThirdService extends LoginService {

    public ResultMsg loginForRegist(String username, String password) {
        System.out.println("正在使用注册登陆");
        return loginRegist(username, password);
    }

    public ResultMsg loginForQQ(String openId) {
        System.out.println("正在使用QQ登陆");
        return null;
    }

    public ResultMsg loginForWeChat(String openId) {
        System.out.println("正在使用微信登陆");
        return null;
    }

    public ResultMsg loginForToken(String token) {
        System.out.println("正在使用Token登陆");
        return null;
    }

    public ResultMsg loginForWeiBo(String openId) {
        System.out.println("正在使用微博登陆");
        return null;
    }

    private ResultMsg loginRegist(String username, String password) {
        super.regist(username, password);
        return super.login(username, password);
    }
}
