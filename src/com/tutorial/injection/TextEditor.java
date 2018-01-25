package com.tutorial.injection;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker, String editorId){
        this.spellChecker = spellChecker;
        System.out.println("Construct texteditor: " + editorId);
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
