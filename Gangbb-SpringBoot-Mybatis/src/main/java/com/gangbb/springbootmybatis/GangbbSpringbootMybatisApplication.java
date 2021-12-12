package com.gangbb.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.gangbb.springbootmybatis.model.dao")
public class GangbbSpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(GangbbSpringbootMybatisApplication.class, args);
    }

}
