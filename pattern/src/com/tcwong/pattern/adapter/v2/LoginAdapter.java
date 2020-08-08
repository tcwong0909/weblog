package com.tcwong.pattern.adapter.v2;

import com.tcwong.pattern.adapter.v1.ResultMsg;

public interface LoginAdapter {

    Boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}
