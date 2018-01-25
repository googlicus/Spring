package com.tutorial.beans;

public class HelloWorld {
    private String Message;

    public void getMessage() {
        System.out.println("receive message " + Message);
    }

    public void setMessage(String message) {
        Message = message;
    }

    private void init() {
        System.out.println("Bean Helloworld is going throw init");
    }

    private void destroy() {
        System.out.println("Bean Helloworld will destroy now");
    }
}
