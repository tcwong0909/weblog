package com.tcwong.pattern.prototype.simpleclone;

import java.util.List;

public class Cat implements Animal {

    private Integer age;

    private String name;

    private List<String> ability;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAbility() {
        return ability;
    }

    public void setAbility(List<String> ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", ability=" + ability +
                '}';
    }

    @Override
    public Animal clone() {
        Cat cat = new Cat();
        cat.setAge(this.age);
        cat.setName(this.name);
        cat.setAbility(this.ability);
        return cat;
    }
}
