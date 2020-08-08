package com.tcwong.pattern.adapter.v2;

import com.tcwong.pattern.adapter.v1.LoginService;
import com.tcwong.pattern.adapter.v1.ResultMsg;

public class PassportForThirdAdapter extends LoginService implements IPassportForThird {
    @Override
    public ResultMsg loginForRegist(String username, String password) {
        return null;
    }

    @Override
    public ResultMsg loginForQQ(String openId) {
        return processLogin(openId,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWeChat(String openId) {
        return processLogin(openId,LoginForWeChatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token,LoginForTokenAdapter.class);
    }

    @Override
    public ResultMsg loginForWeiBo(String openId) {
        return processLogin(openId,LoginForWeiBoAdapter.class);
    }

    private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
        try {
            LoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(key, adapter);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;

    }
}
