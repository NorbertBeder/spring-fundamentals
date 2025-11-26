package org.example.volume1.chapter6.ex7.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Aspect
@Component
@Order(2)
public class LoggingAspect6_7 {

    private Logger logger = Logger.getLogger(LoggingAspect6_7.class.getName());

    @Around(value = "@annotation(org.example.volume1.chapter6.ex7.aspects.ToLog6_7)")
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
