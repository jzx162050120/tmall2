package com.example.tmall2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.example.tmall2.mall.dao"})
@MapperScan(basePackages = "com.example.tmall2.mall.dao")
public class Tmall2Application {

    public static void main(String[] args) {
        SpringApplication.run(Tmall2Application.class, args);
    }

}
