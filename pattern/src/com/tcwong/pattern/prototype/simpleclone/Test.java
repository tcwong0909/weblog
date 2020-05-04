package com.tcwong.pattern.prototype.simpleclone;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat();
        List<String> ability = new ArrayList<>();
        ability.add("抓老鼠");
        ability.add("抓鱼");
        cat.setAge(1);
        cat.setName("ketty");
        cat.setAbility(ability);

        Client client = new Client();
        Cat catClone = (Cat) client.startClone(cat);

        System.out.println(cat);
        ability.add("打架");
        System.out.println(cat);
        System.out.println(catClone);

    }
}
