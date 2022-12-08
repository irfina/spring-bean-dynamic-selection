/*
 * Application.java
 *
 * Created on Dec 08, 2022, 17.34
 */
package com.irfin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Irfin
 */
@SpringBootApplication
public class Application implements CommandLineRunner
{
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }

//    @Autowired
//    ApplicationContext context;

    @Override
    public void run(String... args) throws Exception
    {
//        var beanNames = context.getBeanDefinitionNames();
//        System.out.println("Beans created: ");
//        for (String name : beanNames) {
//            System.out.println(name);
//        }
    }
}
