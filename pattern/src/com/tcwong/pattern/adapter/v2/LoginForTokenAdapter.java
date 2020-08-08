package com.tcwong.pattern.adapter.v2;

import com.tcwong.pattern.adapter.v1.ResultMsg;

public class LoginForTokenAdapter implements LoginAdapter {
    @Override
    public Boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
