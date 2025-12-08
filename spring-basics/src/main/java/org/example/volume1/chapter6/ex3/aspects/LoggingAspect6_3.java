package org.example.volume1.chapter6.ex3.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.volume1.chapter6.model.Comment6;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;


@Aspect
@Component
public class LoggingAspect6_3 {

    private Logger logger = Logger.getLogger(LoggingAspect6_3.class.getName());

    @Around("execution(* org.example.volume1.chapter6.ex3.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();

        logger.info("Method " + methodName + " with parameters " + Arrays.asList(arguments)
                + " will execute");

        Comment6 comment = new Comment6();
        comment.setText("Some other text!");
        Object[] newArguments = {comment};

        Object returnedByMethod = joinPoint.proceed(newArguments);
        logger.info("Method executed and returned " + returnedByMethod);

        return "FAILED";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
