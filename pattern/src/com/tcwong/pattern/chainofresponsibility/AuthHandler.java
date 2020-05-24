package com.tcwong.pattern.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class AuthHandler extends Handler {

    private List<String> roleNameList;

    public AuthHandler() {
        this.roleNameList = new ArrayList<>();
        this.roleNameList.add("管理员");
        this.roleNameList.add("普通用户");
        this.roleNameList.add("游客");
    }

    @Override
    public void doHandler(User user) {
        String roleName = user.getRoleName();
        if (!roleNameList.contains(roleName)) {
            System.out.println("AuthHandler:" + "该用户角色不存在");
            return;
        } else if (!roleName.equals("管理员")) {
            System.out.println("AuthHandler:" + "权限不足");
            return;
        }
        System.out.println("已通过AuthHandler认证");
        System.out.println(user+">>>>>>>>>登陆成功");

    }
}
