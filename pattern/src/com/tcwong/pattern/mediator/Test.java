package com.tcwong.pattern.mediator;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/11/25
 * Since 1.8
 */
public class Test {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("吴彦祖", chatRoom);
        User user2 = new User("周润发", chatRoom);
        user1.sendMessage("大家好，我是阿祖");
        user2.sendMessage("大家好，我是周润发");

    }
}
