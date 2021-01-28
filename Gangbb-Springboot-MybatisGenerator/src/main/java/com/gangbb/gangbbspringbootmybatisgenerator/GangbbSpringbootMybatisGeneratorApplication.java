package com.gangbb.gangbbspringbootmybatisgenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.gangbb.gangbbspringbootmybatisgenerator.model.dao")
public class GangbbSpringbootMybatisGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(GangbbSpringbootMybatisGeneratorApplication.class, args);
    }

}
