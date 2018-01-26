package com.tutorial.javaBased;

import org.springframework.context.ApplicationEvent;

/**
 * Created by danil.karimov on 26.01.2018.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }

    public String toString(){
        return "My custom event";
    }
}
