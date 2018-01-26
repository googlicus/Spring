package com.tutorial.javaBased;

import com.tutorial.beans.HelloWorld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by danil.karimov on 26.01.2018.
 */
public class MainApp {

    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(HelloWorldConfig.class);
        // instead this @import
        // applicationContext.register(TextEditorConfig.class);
        applicationContext.refresh();
        applicationContext.start();

        applicationContext.getBean(HelloWorld.class).setMessage("configuration message");
        applicationContext.getBean(HelloWorld.class).getMessage();

        applicationContext.getBean(TextEditor.class).spellCheck();

        applicationContext.getBean(CustomEventPublisher.class).publish();

        applicationContext.stop();
    }
}
