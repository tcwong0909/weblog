package com.tcwong.pattern.observer;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/10/20
 * Since 1.8
 */
public class MailContent {
    private String theme;
    private String content;

    public MailContent(String theme, String content) {
        this.theme = theme;
        this.content = content;
    }

    public String getTheme() {
        return theme;
    }

    public String getContent() {
        return content;
    }
}
