package com.tutorial.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("di_beans.xml");
        TextEditor textEditor = (TextEditor) applicationContext.getBean("TextEditor");
        textEditor.spellCheck();

        TextEditorSetter textEditorSetter = (TextEditorSetter) applicationContext.getBean("TextEditorSetter");
        textEditorSetter.spellCheck();

        JavaCollection javaCollection = (JavaCollection) applicationContext.getBean("JavaCollection");
        javaCollection.getAddressList();
        javaCollection.getAddressMap();
    }
}
