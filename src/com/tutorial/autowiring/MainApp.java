package com.tutorial.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");
        // by name
        ((TextEditor)applicationContext.getBean("textEditor")).spellCheck();
        // by type
        ((TextEditor)applicationContext.getBean("textEditorTyped")).spellCheck();
        // constructor
        ((TextEditor)applicationContext.getBean("textEditorCon")).spellCheck();
        // annotation autoWiring
        ((TextEditorAuto)applicationContext.getBean("textEditorAuto")).spellCheck();

        ((Profile)applicationContext.getBean("Profile")).printAge();
        ((Profile)applicationContext.getBean("Profile")).printName();
    }
}