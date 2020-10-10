package com.tcwong.spi;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/10/10
 * Since 1.8
 */
public class Pig implements Animal {
    @Override
    public void eat() {
        System.out.println("猪吃>>>>>草");
    }
}
