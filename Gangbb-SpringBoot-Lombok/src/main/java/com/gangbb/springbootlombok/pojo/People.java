package com.gangbb.springbootlombok.pojo;

import lombok.ToString;

/**
 * @author : Gangbb
 * @ClassName : People
 * @Description :
 * @Date : 2021/1/29 7:43
 */
@ToString(exclude = {"type", "id"}, of = {"remark"})
public class People {
    private String type;
    private Integer id;
    private String remark;
    private String age;
}
