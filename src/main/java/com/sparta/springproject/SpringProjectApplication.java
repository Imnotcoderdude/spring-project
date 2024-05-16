package com.sparta.springproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProjectApplication {
    // 서버 포트는 8081임
    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }
}
