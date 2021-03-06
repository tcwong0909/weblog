package com.tcwong.pattern.prototype.deepclone;

import com.tcwong.pattern.prototype.simpleclone.Animal;

import java.io.*;
import java.util.List;

public class Dog implements Serializable, Animal {

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
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", ability=" + ability +
                '}';
    }


    @Override
    public Animal clone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Dog dog = (Dog)ois.readObject();
            return dog;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
