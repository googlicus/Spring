package com.tutorial.javaBased;

import com.tutorial.autowiring.SpellChecker;

/**
 * Created by danil.karimov on 26.01.2018.
 */
public class TextEditor {

        private SpellChecker spellChecker;

        public TextEditor(SpellChecker spellChecker){
            System.out.println("Inside TextEditor constructor." );
            this.spellChecker = spellChecker;
        }
        public void spellCheck(){
            spellChecker.spellCheck();
        }

        public void init(){
            System.out.println("init method");
        }

        public void destroy(){
            System.out.println("destroy method");
        }
}
