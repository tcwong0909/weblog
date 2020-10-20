package com.tcwong.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/10/20
 * Since 1.8
 */
public class MailSubscriber implements Observer {

    private String name;

    public MailSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        MailServer mailServer = (MailServer) o;
        MailContent mailContent = (MailContent) arg;
        System.out.println("\n"+this.name + "收到来自"+mailServer.getServerName()+"的邮件:");
        System.out.println("主题:"+mailContent.getTheme());
        System.out.println("内容:"+mailContent.getContent());
    }
}
