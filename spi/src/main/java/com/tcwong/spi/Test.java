package com.tcwong.spi;

import java.util.ServiceLoader;

/**
 * Description
 *
 * @author tcwong
 * @date 2020/10/10
 * Since 1.8
 */
public class Test {
    public static void main(String[] args) {
        ServiceLoader<Animal> animalServiceLoader = ServiceLoader.load(Animal.class);
        for (Animal animal : animalServiceLoader) {
            animal.eat();
        }
    }
}
