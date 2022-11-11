package com.dailycode.aopdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

    @Before("execution(* com.dailycode.aopdemo.entity.ShoppingCart.checkout(..))")
    public void beforeLogger() {
        log.info("Before loggers");
    }

    // @After("execution(* *.*.checkout())")// start any return type, any pakage, any class, chekout() function
    @After("execution(* com.dailycode.aopdemo.entity.*.checkout(..))")// start any return type, any pakage, any class, chekout() function
    public void afterLogger() {
        log.info("After loggers");
    }
}