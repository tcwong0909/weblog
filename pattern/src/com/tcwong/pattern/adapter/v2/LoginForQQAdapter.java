package com.tcwong.pattern.adapter.v2;

import com.tcwong.pattern.adapter.v1.ResultMsg;

public class LoginForQQAdapter implements LoginAdapter {
    @Override
    public Boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
