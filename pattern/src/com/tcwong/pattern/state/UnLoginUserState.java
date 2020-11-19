package com.tcwong.pattern.state;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/15
 * Since 1.8
 */
public class UnLoginUserState extends AbstractUserState {

    @Override
    public void favorite() {
        switchToLogin();
        this.appContext.getCurrentState().favorite();
    }

    @Override
    public void comment(String comment) {
        switchToLogin();
        this.appContext.getCurrentState().comment(comment);
    }

    private void switchToLogin() {
        System.out.println("跳转至登陆页面");
        this.appContext.setCurrentState(AppContext.STATE_LOGIN);
    }
}
