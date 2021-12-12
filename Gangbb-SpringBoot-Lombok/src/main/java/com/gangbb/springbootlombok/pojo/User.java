package com.gangbb.springbootlombok.pojo;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author : Gangbb
 * @ClassName : User
 * @Description :
 * @Date : 2021/1/29 7:00
 */
@RequiredArgsConstructor
public class User {
    private static String name;
    private final Integer age;
    @NonNull
    private String phone;
    @NonNull
    private String address;
    private String remark;

}
