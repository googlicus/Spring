package com.tutorial.autowiring;

/**
 * Created by danil.karimov on 26.01.2018.
 */
public class Student {
    private Integer age;
    private String name;

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
