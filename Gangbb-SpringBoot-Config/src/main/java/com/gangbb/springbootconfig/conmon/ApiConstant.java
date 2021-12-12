package com.gangbb.springbootconfig.conmon;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : lyx
 * @ClassName : ApiConstant
 * @Description :
 * @Date : 2021/1/21 9:25
 */

@Component
@ConfigurationProperties(prefix = "gangbb")
public class ApiConstant {
    private  String name;
    private  String info;
    private  String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
