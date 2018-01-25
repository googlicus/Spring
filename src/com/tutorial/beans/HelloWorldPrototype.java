package com.tutorial.beans;

public class HelloWorldPrototype {
    private String Message;

    public void getMessage() {
        System.out.println("receive message " + Message);
    }

    public void setMessage(String message) {
        Message = message;
    }


}
