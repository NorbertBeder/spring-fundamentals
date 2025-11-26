package org.example.volume1.chapter6.ex1.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Aspect
@Component
public class LoggingAspect6_1 {

    private Logger logger = Logger.getLogger(LoggingAspect6_1.class.getName());

    @Around("execution(* org.example.volume1.chapter6.ex1.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Method will execute");
        joinPoint.proceed();
        logger.info("Method executed");
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
