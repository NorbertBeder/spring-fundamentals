package com.example.aoppointcuts.aspects.annotation;

import com.example.aoppointcuts.model.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


// Aspect that intercepts method calls where the TARGET object has @AuditedService annotation

@Aspect
@Component
public class AnnotationTargetAspect {
    @Around("@target(com.example.aoppointcuts.util.AuditedService) && within(com.example.aoppointcuts..*)")
    public Object logTargetAnnotatedBeans(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("[@target] Service class is @AuditedService.");

        return pjp.proceed();
    }
}

