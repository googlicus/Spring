package com.tutorial.aop;

import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAnno {

    @Pointcut("execution(* com.tutorial.aop.*.*(..))")
    public void selectAll(){
    }

    @Before("selectAll()")
    public void beforeAdvice(){
        System.out.println("beforeAdvice called");
    }

    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("afterAdvice called");
    }

    @AfterReturning(pointcut = "selectAll()", returning = "returnedVal")
    public void afterReturningAdvice(Object returnedVal){
        System.out.println("afterReturning advice called: " + returnedVal);
    }

    @AfterThrowing(pointcut = "selectAll()", throwing = "ex")
    public void afterExceptionAdvice(Exception ex){
        System.out.println("AfterException advice called: " + ex.getMessage());
    }

//    @Around("selectAll()")
//    public void aroundAdvice(){
//        System.out.println("aroundAdvice called");
//    }
}
