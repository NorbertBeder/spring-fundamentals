package com.example.aoppointcuts.aspects.annotation;

import com.example.aoppointcuts.model.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


// Aspect that intercepts method calls to classes where the declared type of the target object has @AuditedService annotation
@Aspect
@Component
public class AnnotationWithinAspect {
    @Around("@within(com.example.aoppointcuts.util.AuditedService) && within(com.example.aoppointcuts..*)")
    public Object logClassAnnotatedMethods(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[@within] Method inside @AuditedService class.");

        return pjp.proceed();
    }
}
