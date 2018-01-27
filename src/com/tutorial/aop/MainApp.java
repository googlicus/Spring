package com.tutorial.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

        Student student = (Student) context.getBean("student");
        student.getAge();
        student.getName();
//        try {
////            student.raiseException();
////        } catch (IllegalAccessException e) {
////            e.printStackTrace();
////        }

        System.out.println("Aspectj annotations");
        Student studentAnno = (Student) context.getBean("studentAnno");
        studentAnno.getAge();
        studentAnno.getName();
        try {
            studentAnno.raiseException();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
