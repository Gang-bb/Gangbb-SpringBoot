package com.gangbb.springbootlombok.pojo;

/**
 * @author : Gangbb
 * @ClassName : Data
 * @Description :
 * @Date : 2021/1/29 8:49
 */
@lombok.Data
public class Data {
    private String type;
    private Integer id;
    private String remark;
    private Integer age;
    private Boolean status;
    private Long other_id;
}
