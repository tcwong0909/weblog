package com.tcwong.pattern.state;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/15
 * Since 1.8
 */
public class AppContext {

    public static final AbstractUserState STATE_LOGIN = new LoginUserState();

    public static final AbstractUserState STATE_UNLOGIN = new UnLoginUserState();

    private  AbstractUserState currentState = STATE_UNLOGIN;

    {
        STATE_LOGIN.setAppContext(this);
        STATE_UNLOGIN.setAppContext(this);
    }

    public AbstractUserState getCurrentState() {
        return this.currentState;
    }

    public void setCurrentState(AbstractUserState userState) {
        this.currentState = userState;
    }

    public void favorite() {
        this.currentState.favorite();
    }

    public void comment(String comment) {
        this.currentState.comment(comment);
    }
}
