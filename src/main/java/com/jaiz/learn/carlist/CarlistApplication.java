package com.jaiz.learn.carlist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jaiz.learn.carlist.dao")
public class CarlistApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarlistApplication.class, args);
    }
}
