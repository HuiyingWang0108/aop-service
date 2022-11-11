package com.dailycode.aopdemo.entity;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ShoppingCart {
    

    public void checkout() {

        log.info("checkout method from ShoppingCart class");
    }

}
