package com.tutorial.beans;

public class HelloIndia {
    private String message;
    private String message2;

    public void getMessage2() {
        System.out.println("India message2: " + message2);
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void getMessage() {
        System.out.println("India message: " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
