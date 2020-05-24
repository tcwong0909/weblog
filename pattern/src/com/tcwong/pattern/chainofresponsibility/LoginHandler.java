package com.tcwong.pattern.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

public class LoginHandler extends Handler {

    private Map<String, String> userMap;

    public LoginHandler() {
        this.userMap = new HashMap<>();
        this.userMap.put("张三", "zs123456");
        this.userMap.put("李四", "ls123456");
    }

    @Override
    public void doHandler(User user) {
        String name = user.getName();
        String password = user.getPassword();
        if (!userMap.keySet().contains(name)) {
            System.out.println("LoginHandler>>>>>>" + "登陆用户："+name + "-----用户不存在");
            return;
        } else if (!userMap.values().contains(password)) {
            System.out.println("LoginHandler>>>>>>" + "登陆用户："+ name  + "-----密码不正确");
            return;
        }
        System.out.println("已通过LoginHandler认证");
        next.doHandler(user);
    }
}
