package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSchedulerApplication.class, args);
    }

}
