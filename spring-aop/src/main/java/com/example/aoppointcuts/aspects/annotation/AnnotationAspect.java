package com.example.aoppointcuts.aspects.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


// Aspect that intercepts method calls to methods annotated with @AuditedMethod
@Aspect
@Component
public class AnnotationAspect {
    @Around("@annotation(com.example.aoppointcuts.util.AuditedMethod) && within(com.example.aoppointcuts..*)")
    public Object logAnnotatedMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[@annotation] @AuditedOperation triggered." );

        return pjp.proceed();
    }
}
