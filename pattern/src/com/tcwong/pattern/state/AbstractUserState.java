package com.tcwong.pattern.state;

/**
 * Description 抽象用户状态
 *
 * @author tcwong
 * @date 2020/11/15
 * Since 1.8
 */
public abstract class AbstractUserState {

    /**
    * 上下文
    */
    protected AppContext appContext;

    public void setAppContext(AppContext appContext) {
        this.appContext = appContext;
    }

    public abstract void favorite();

    public abstract void comment(String comment);
}
