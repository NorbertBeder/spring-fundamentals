package com.example.aoppointcuts.aspects;

import com.example.aoppointcuts.model.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// Example aspect with execution that logs the first name of the user that is being created
@Aspect
@Component
public class ExecutionAspect {

    @Around("execution(* com.example.aoppointcuts.service.UserService.createUser(..))")
    public Object logCreatedUserFirstName(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();

        if (args.length > 0 && args[0] instanceof User user) {
            System.out.println("execution(): Creating user with first name: " + user.getFirstName());
        }

        return joinPoint.proceed();
    }
}
