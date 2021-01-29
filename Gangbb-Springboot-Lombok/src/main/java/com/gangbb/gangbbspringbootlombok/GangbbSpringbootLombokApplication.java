package com.gangbb.gangbbspringbootlombok;

import com.gangbb.gangbbspringbootlombok.model.pojo.User3;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class GangbbSpringbootLombokApplication {

    public static void main(String[] args) {
        log.info("@Slf4j");
//        User3 user3 = User3.builder()
//                .id(666)
//                .remark("user3")
//                .type("user3")
//                .build();
//        System.out.println(user3.toString());
        SpringApplication.run(GangbbSpringbootLombokApplication.class, args);
    }

}
