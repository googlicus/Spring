package com.tutorial.autowiring;

import com.tutorial.autowiring.SpellChecker;

public class TextEditor{
    private SpellChecker spellChecker;
    private String name;

    public TextEditor(){
        System.out.println("Inside textEditor constructor: " + name);
    }

    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside textEditorCon constructor: " + name);
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck(){
        spellChecker.spellCheck();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}