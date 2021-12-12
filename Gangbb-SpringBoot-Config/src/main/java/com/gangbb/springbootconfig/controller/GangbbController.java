package com.gangbb.springbootconfig.controller;


import com.gangbb.springbootconfig.conmon.ApiConstant;
import com.gangbb.springbootconfig.conmon.Gangbb;
import com.gangbb.springbootconfig.conmon.GangbbConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : lyx
 * @ClassName : GangbbController
 * @Description :
 * @Date : 2021/1/21 7:58
 */
@RestController
public class GangbbController {
    @Value("${gangbb.sex}")
    String sex;

    @Autowired
    private GangbbConstant gangbbConstant;

    @Autowired
    private ApiConstant apiConstant;

    @Autowired
    private Gangbb gangbb;

    @RequestMapping("/")
    String name() {
        System.out.println(gangbb.getName());
        System.out.println(gangbb.getSex());
        System.out.println(gangbb.getInfo());
        return "Gangbb";
    }

}
