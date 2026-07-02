package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.service.*.*(..))")
    public void before(JoinPoint jp) {
        System.out.println("Before executing: " + jp.getSignature().getName());
    }

    @After("execution(* com.library.service.*.*(..))")
    public void after(JoinPoint jp) {
        System.out.println("After executing: " + jp.getSignature().getName());
    }

}