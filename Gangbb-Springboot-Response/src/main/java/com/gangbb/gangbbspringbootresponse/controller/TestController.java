package com.gangbb.gangbbspringbootresponse.controller;

import com.gangbb.gangbbspringbootresponse.bo.User;
import com.gangbb.gangbbspringbootresponse.common.ApiRestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gangbb
 * @ClassName : TestController
 * @Description :
 * @Date : 2021/1/23 9:36
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public ApiRestResponse test(){
        User user = new User(123456, "Gangbb");
        return ApiRestResponse.success(user);
    }
}
