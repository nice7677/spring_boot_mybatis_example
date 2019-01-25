package com.spring.summer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.spring.summer.mybatis")
public class SummerMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SummerMybatisApplication.class, args);
    }

}

