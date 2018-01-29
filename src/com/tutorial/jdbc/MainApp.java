package com.tutorial.jdbc;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by danil.karimov on 29.01.2018.
 */
public class MainApp {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");

        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        studentJDBCTemplate.create("Zara", 19);
        studentJDBCTemplate.create("Le chat", 23);
        studentJDBCTemplate.create("La chatte", 27);

        for (Student student : studentJDBCTemplate.listStudents()){
            System.out.println(student.getName());
        }

        Student student = studentJDBCTemplate.getStudent(2);
        System.out.println(student.getName());

        studentJDBCTemplate.delete(2);
    }
}
