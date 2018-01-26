package com.tutorial.javaBased;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by danil.karimov on 26.01.2018.
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publish(){
        CustomEvent event = new CustomEvent(this);
        System.out.println("Publish event:" + event.toString());
        applicationEventPublisher.publishEvent(event);
    }
}
