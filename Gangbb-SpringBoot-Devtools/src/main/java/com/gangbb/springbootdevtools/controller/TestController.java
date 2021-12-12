package com.gangbb.springbootdevtools.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gangbb
 * @ClassName : TestController
 * @Description :
 * @Date : 2021/1/29 10:26
 */
@RestController
public class TestController {
    @GetMapping("/")
    public String test(){
        return "test2222";
    }
}
