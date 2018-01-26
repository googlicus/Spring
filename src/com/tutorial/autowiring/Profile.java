package com.tutorial.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by danil.karimov on 26.01.2018.
 */
public class Profile {
    @Autowired
    @Qualifier("student2")
    private Student student;

    public Profile(){

    }

    public void printAge(){
        System.out.println("student's age is: " + student.getAge());
    }

    public void printName(){
        System.out.println("student's name is: " + student.getName());
    }
}
