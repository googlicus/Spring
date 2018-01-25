package com.tutorial.beans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args){
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld world = (HelloWorld) applicationContext.getBean("HelloWorld");
        world.setMessage("Im singleton");
        world.getMessage();

        HelloWorld world2 = (HelloWorld) applicationContext.getBean("HelloWorld");
        world2.getMessage();

        HelloWorldPrototype worldPrototype = (HelloWorldPrototype) applicationContext.getBean("HelloWorldPrototype");
        worldPrototype.setMessage("im prototype");
        worldPrototype.getMessage();

        HelloIndia helloIndia = (HelloIndia) applicationContext.getBean("HelloIndia");
        helloIndia.getMessage();
        helloIndia.getMessage2();

        // by default scope is singleton
//        HelloIndia helloIndia2 = (HelloIndia) applicationContext.getBean("HelloIndia");
//        helloIndia2.getMessage();
//        helloIndia2.getMessage2();

        HelloWorldPrototype worldPrototype2 = (HelloWorldPrototype) applicationContext.getBean("HelloWorldPrototype");
        worldPrototype2.getMessage();

        applicationContext.registerShutdownHook();
    }
}
