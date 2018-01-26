package com.tutorial.javaBased;

import com.tutorial.beans.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by danil.karimov on 26.01.2018.
 */
@Configuration
@Import(TextEditorConfig.class)
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

    @Bean
    public ContextStartHandler contextStartHandler(){
        return new ContextStartHandler();
    }

    @Bean
    public ContextStopHandler contextStopHandler(){
        return new ContextStopHandler();
    }

    @Bean
    public CustomEventPublisher customEventPublisher(){
        return new CustomEventPublisher();
    }

    @Bean
    public CustomEventListener customEventListener(){
        return new CustomEventListener();
    }
}
