package com.tutorial.javaBased;

import org.springframework.context.ApplicationListener;

/**
 * Created by danil.karimov on 26.01.2018.
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println("Receive event: " + customEvent.toString());
    }
}
