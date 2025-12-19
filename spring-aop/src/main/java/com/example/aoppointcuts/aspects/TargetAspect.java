package com.example.aoppointcuts.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


// Example aspect with target pointcut that matches beans of type UserService
//  / where the target object (the ultimate object being advised by Spring AOP proxy) is an instance of the given type.
@Aspect
@Component
public class TargetAspect {
        // This MATCHES because the target object is of type UserServiceImpl, which implements UserService
        @Before("target(com.example.aoppointcuts.service.UserService)")
        public void beforeUserServiceMethods() {
            System.out.println("target() on service: A method in UserService is about to be called.");

        }

        // This MATCHES because the target object is of type UserServiceImpl
        @Before("target(com.example.aoppointcuts.service.impl.UserServiceImpl)")
        public void beforeUserServiceMethodsImpl() {
            System.out.println("target() on impl: A method in UserServiceImpl is about to be called.");
        }
}
