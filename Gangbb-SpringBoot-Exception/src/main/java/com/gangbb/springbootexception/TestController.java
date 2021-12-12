package com.gangbb.springbootexception;

import com.gangbb.springbootexception.exception.ApiException;
import com.gangbb.springbootexception.exception.ApiExceptionEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Gangbb
 * @ClassName : TestController
 * @Description :
 * @Date : 2021/1/23 10:15
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        throw new ApiException(ApiExceptionEnum.MISTAKE);

    }
}
