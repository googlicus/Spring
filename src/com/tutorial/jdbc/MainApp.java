package com.tutorial.jdbc;

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

        //Student student = studentJDBCTemplate.getStudent(2);
        //System.out.println(student.getName());

        //studentJDBCTemplate.delete(2);

        studentJDBCTemplate.createMark(-1, 2005, 4);
        studentJDBCTemplate.createMark(-1, 2009, 5);

        for (Student st: studentJDBCTemplate.listStudents()){
            System.out.print(st.getName() + " ");
            System.out.print(st.getYear() + " ");
            System.out.println(st.getMarks());
        }
    }
}
