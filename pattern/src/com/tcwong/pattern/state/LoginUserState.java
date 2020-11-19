package com.tcwong.pattern.state;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/15
 * Since 1.8
 */
public class LoginUserState extends AbstractUserState {

    @Override
    public void favorite() {
        System.out.println("收藏成功");
    }

    @Override
    public void comment(String comment) {
        System.out.println(comment);
    }
}
