package com.dailycode.aopdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import com.dailycode.aopdemo.config.ApplicationConfiguration;
import com.dailycode.aopdemo.entity.ShoppingCart;

@SpringBootApplication
public class AopDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
		
	}
	
	@Bean
    public CommandLineRunner CommandLineRunnerBean() {
        return (args) -> {
            ApplicationContext context 
				= new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
			ShoppingCart cart = context.getBean(ShoppingCart.class);
			cart.checkout("Error");

        };
    }


}
