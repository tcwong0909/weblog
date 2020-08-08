package com.tcwong.pattern.adapter.v2;

import com.tcwong.pattern.adapter.v1.ResultMsg;

public interface IPassportForThird {

    public ResultMsg loginForRegist(String username, String password);

    public ResultMsg loginForQQ(String openId);

    public ResultMsg loginForWeChat(String openId);

    public ResultMsg loginForToken(String token);

    public ResultMsg loginForWeiBo(String openId);
}
