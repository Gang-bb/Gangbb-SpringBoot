package com.gangbb.gangbbspringbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.gangbb.gangbbspringbootmybatis.model.dao")
public class GangbbSpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(GangbbSpringbootMybatisApplication.class, args);
    }

}
