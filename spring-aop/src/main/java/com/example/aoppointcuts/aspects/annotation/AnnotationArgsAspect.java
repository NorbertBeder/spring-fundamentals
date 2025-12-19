package com.example.aoppointcuts.aspects.annotation;

import com.example.aoppointcuts.model.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


// Aspect that intercepts method calls where the arguments are annotated with @ValidatedUser
@Aspect
@Component
public class AnnotationArgsAspect {
    @Around("@args(com.example.aoppointcuts.util.ValidatedUser) && within(com.example.aoppointcuts..*)")
    public Object logAnnotatedArguments(ProceedingJoinPoint pjp) throws Throwable {

        for (Object arg : pjp.getArgs()) {
            if (arg instanceof User user) {
                System.out.println("[@args] User argument is annotated with @ValidatedUser. firstName = " + user.getFirstName());
            }
        }

        return pjp.proceed();
    }
}
