package com.tcwong.pattern.adapter.v1;

public class LoginService {

    public ResultMsg regist(String username, String password) {
        System.out.println("开始注册用户，用户名:"+username);
        return new ResultMsg(null, null);
    }

    public ResultMsg login(String username, String password) {
        System.out.println("开始登陆，登陆用户:"+username);
        return new ResultMsg(null, null);
    }
}
