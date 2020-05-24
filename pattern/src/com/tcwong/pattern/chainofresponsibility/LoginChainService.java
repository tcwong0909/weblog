package com.tcwong.pattern.chainofresponsibility;

public class LoginChainService {

    public void doLogin(String userName, String password, String roleName) {
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler())
                .addHandler(new LoginHandler())
                .addHandler(new AuthHandler());
        builder.build().doHandler(new User(userName,password,roleName));
    }


}
