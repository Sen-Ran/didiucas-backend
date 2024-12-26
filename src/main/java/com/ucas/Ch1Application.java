package com.ucas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ch1Application {
    public static void main(String[] args){
        SpringApplication.run(Ch1Application.class,args);
        System.out.println("Hello World!");
        String version = System.getProperty("java.version");
        System.out.println("当前 Java 版本: " + version);
    }
}