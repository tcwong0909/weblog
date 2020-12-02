package com.tcwong.pattern.facade;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/12/2
 * Since 1.8
 */
public class Test {
    public static void main(String[] args) {
        User user = new User("小明");
        FacadeService facadeService = new FacadeService();
        facadeService.doOut(user);
    }
}
