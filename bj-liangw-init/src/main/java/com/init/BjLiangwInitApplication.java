package com.init;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.init.dao")
@SpringBootApplication
public class BjLiangwInitApplication {

    public static void main(String[] args) {
        SpringApplication.run(BjLiangwInitApplication.class, args);
    }

}
