package com.tcwong.pattern.chainofresponsibility;

public class Test {

    public static void main(String[] args) {
        LoginChainService loginChainService = new LoginChainService();
        loginChainService.doLogin("张三", "zs123456", "管理员");

    }

}
