package com.tutorial.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by danil.karimov on 26.01.2018.
 */
public class TextEditorAuto {
    @Autowired
    private SpellChecker spellChecker;
    @Autowired(required = false)
    private Integer Age;

    @Autowired
    public TextEditorAuto(SpellChecker spellChecker){
        System.out.println("Inside textEditor auto");
        this.spellChecker = spellChecker;
    }

    @PostConstruct
    private void init() {
        System.out.println("init textEditor auto anno");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("destroy textEditor auto anno");
    }

    public void spellCheck(){
        spellChecker.spellCheck();
    }
}
