package com.tutorial.javaBased;

import com.tutorial.autowiring.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by danil.karimov on 26.01.2018.
 */
@Configuration
public class TextEditorConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public TextEditor textEditor(){
        return new TextEditor(spellChecker());
    }

    @Scope("prototype")
    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }
}
