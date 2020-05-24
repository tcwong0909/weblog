package com.tcwong.pattern.chainofresponsibility;

public class ValidateHandler extends Handler {
    @Override
    public void doHandler(User user) {
        String name = user.getName();
        String password = user.getPassword();
        if (name == null) {
            System.out.println("ValidateHandler:" + "用户姓名不能为空");
            return;
        } else if (password == null) {
            System.out.println("ValidateHandler:" + "用户密码不能为空");
            return;
        }
        System.out.println("已通过ValidateHandler认证");
        next.doHandler(user);
    }

}
