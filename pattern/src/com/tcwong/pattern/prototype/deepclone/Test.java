package com.tcwong.pattern.prototype.deepclone;

import com.tcwong.pattern.prototype.simpleclone.Animal;
import com.tcwong.pattern.prototype.simpleclone.Cat;
import com.tcwong.pattern.prototype.simpleclone.Client;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Dog dog = new Dog();
        List<String> ability = new ArrayList<>();
        ability.add("看家");
        dog.setName("嘟嘟");
        dog.setAge(2);
        dog.setAbility(ability);

        Client client = new Client();
        Dog dogClone = (Dog)client.startClone(dog);
        System.out.println(dog);
        ability.add("和主人玩耍");
        System.out.println(dog);
        System.out.println(dogClone);
    }
}
