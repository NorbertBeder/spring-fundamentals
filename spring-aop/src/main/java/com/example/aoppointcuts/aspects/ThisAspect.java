package com.example.aoppointcuts.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


// Example aspect with this pointcut that matches beans of type UserService
//  / where the bean reference (Spring AOP proxy) is an instance of the given type.
@Aspect
@Component
public class ThisAspect {

     @Before("this(com.example.aoppointcuts.service.UserService)")
     public void beforeUserServiceMethods() {
         System.out.println("this() on service: A method in UserService is about to be called.");

     }

     // This DOES NOT MATCH because the proxy is of type UserServiceImpl, not UserService
    @Before("this(com.example.aoppointcuts.service.impl.UserServiceImpl)")
    public void beforeUserServiceMethodsImpl() {
        System.out.println("this() on impl: A method in UserService is about to be called.");
    }
}
