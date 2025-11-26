package org.example.volume1.chapter6.ex5.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Aspect
@Component
public class LoggingAspect6_5 {

    private Logger logger = Logger.getLogger(LoggingAspect6_5.class.getName());

    @AfterReturning(value = "@annotation(org.example.volume1.chapter6.ex5.aspects.ToLog6_5)",
            returning = "returnedValue")
    public void log(Object returnedValue) {
        logger.info("Method executed and returned " + returnedValue);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
