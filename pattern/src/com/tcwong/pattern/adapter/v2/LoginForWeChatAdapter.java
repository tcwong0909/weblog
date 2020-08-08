package com.tcwong.pattern.adapter.v2;

import com.tcwong.pattern.adapter.v1.ResultMsg;

public class LoginForWeChatAdapter implements LoginAdapter {
    @Override
    public Boolean support(Object adapter) {
        return adapter instanceof LoginForWeChatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
