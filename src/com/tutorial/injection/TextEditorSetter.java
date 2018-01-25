package com.tutorial.injection;

public class TextEditorSetter {
    private SpellChecker spellChecker;

    public void setSpellChecker(SpellChecker spellChecker){
        System.out.println("Inside setSpellChecker");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker(){
        return spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
