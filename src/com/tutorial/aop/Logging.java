package com.tutorial.aop;

public class Logging {

    public void beforeAdvice(){
        System.out.println("beforeAdvice called");
    }

    public void afterAdvice(){
        System.out.println("afterAdvice called");
    }

    public void afterReturningAdvice(Object returnedVal){
        System.out.println("afterReturning advice called: " + returnedVal);
    }

    public void afterExceptionAdvice(Exception ex){
        System.out.println("AfterException advice called: " + ex.getMessage());
    }

    public void aroundAdvice(){
        System.out.println("aroundAdvice called");
    }
}
