package com.tcwong.pattern.mediator;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/25
 * Since 1.8
 */
public class ChatRoom {

    public void showMessage(User user, String message) {
        System.out.println("["+user.getName()+"]:"+message);
    }
}
