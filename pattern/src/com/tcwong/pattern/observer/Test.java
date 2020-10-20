package com.tcwong.pattern.observer;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/10/20
 * Since 1.8
 */
public class Test {
    public static void main(String[] args) {
        MailServer mailServer = MailServer.getMailServer();
        MailContent mailContent = new MailContent("今日头条", "震惊！在今日凌晨人民公园，区警察巡逻时发现一男子张三，竟然可以在公园躺椅上睡着");
        //添加订阅者
        mailServer.addObserver(new MailSubscriber("李丝丝"));
        mailServer.addObserver(new MailSubscriber("宿千千"));
        //发布邮件
        mailServer.publishMail(mailContent);
    }
}
