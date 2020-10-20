package com.tcwong.pattern.observer;

import java.util.Observable;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/10/20
 * Since 1.8
 */
public class MailServer extends Observable {

    private static MailServer mailServer = new MailServer("每日早报服务器");

    private String serverName;

    private MailServer(String serverName) {
        this.serverName = serverName;
    }

    public void publishMail(MailContent mailContent) {
        System.err.println("服务器发送邮件，邮件主题：" + mailContent.getTheme());
        setChanged();
        notifyObservers(mailContent);
    }

    public String getServerName() {
        return serverName;
    }

    public static MailServer getMailServer() {
        return mailServer;
    }
}
