package com.tcwong.pattern.facade;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/12/2
 * Since 1.8
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
