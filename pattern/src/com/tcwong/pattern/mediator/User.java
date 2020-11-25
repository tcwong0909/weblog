package com.tcwong.pattern.mediator;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/25
 * Since 1.8
 */
public class User {

    private String name;

    private ChatRoom chatRoom;

    public User(String name, ChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chatRoom.showMessage(this, message);
    }
}
