package com.tcwong.pattern.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginStrategy {

    public static String ALIPAY = "ALIPAY";
    public static String QQ = "QQ";
    public static String SINAWEIBO = "SINAWEIBO";
    public static String WECHAT = "WECHAT";
    public static String DEFAULT = WECHAT;

    private static Map<String, Login> LOGINMAP = new ConcurrentHashMap<>();

    static {
        LOGINMAP.put(ALIPAY, new AlipayLogin());
        LOGINMAP.put(QQ, new QQLogin());
        LOGINMAP.put(SINAWEIBO, new SinaWeiboLogin());
        LOGINMAP.put(WECHAT, new WeChatLogin());
    }


    public Login doLogin(String loginWay) {
        Login login = LOGINMAP.get(loginWay);
        login = (login == null ? LOGINMAP.get(DEFAULT) : login);
        String loginResult = login.doLogin(loginWay);
        System.out.println(loginResult);
        return login;
    }

}
