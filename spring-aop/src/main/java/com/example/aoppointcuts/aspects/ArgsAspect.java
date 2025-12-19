package com.example.aoppointcuts.aspects;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


// Example aspect with args pointcut that matches methods with specific argument types
@Aspect
@Component
public class ArgsAspect {
    @Around("args(java.lang.Long) && within(com.example.aoppointcuts..*)")
    public Object logLongArgumentMethods(org.aspectj.lang.ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("args(): Method with Long argument called: " + joinPoint.getSignature());
        return joinPoint.proceed();
    }
}
