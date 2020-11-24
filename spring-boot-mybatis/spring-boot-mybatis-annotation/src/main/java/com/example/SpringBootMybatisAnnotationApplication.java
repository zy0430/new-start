package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan()
public class SpringBootMybatisAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisAnnotationApplication.class, args);
    }

}
