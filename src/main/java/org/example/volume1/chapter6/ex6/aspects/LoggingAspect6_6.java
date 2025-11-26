package org.example.volume1.chapter6.ex6.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Aspect
@Component
public class LoggingAspect6_6 {

    private Logger logger = Logger.getLogger(LoggingAspect6_6.class.getName());

    @Around(value = "@annotation(org.example.volume1.chapter6.ex6.aspects.ToLog6_6)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Logging Aspect: Calling the intercepted method");
        Object returnedValue = joinPoint.proceed();
        logger.info("Logging Aspect: Method executed and returned " + returnedValue);
        return returnedValue;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
