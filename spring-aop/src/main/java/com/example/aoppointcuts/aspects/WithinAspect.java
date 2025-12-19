package com.example.aoppointcuts.aspects;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


// Example aspect with within pointcut that logs execution time of methods within UserService
@Aspect
@Component
public class WithinAspect {

    @Around("within(com.example.aoppointcuts.service.impl.UserServiceImpl)")
    public Object logExecutionTime(org.aspectj.lang.ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long executionTime = System.currentTimeMillis() - start;
        System.out.println("within(): " + joinPoint.getSignature() + " executed in " + executionTime + "ms");
        return proceed;
    }
}
