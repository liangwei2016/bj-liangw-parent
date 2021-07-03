package com.liangw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.liangw.mapper")
public class BjLiangwShardingjdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(BjLiangwShardingjdbcApplication.class, args);
    }

}
