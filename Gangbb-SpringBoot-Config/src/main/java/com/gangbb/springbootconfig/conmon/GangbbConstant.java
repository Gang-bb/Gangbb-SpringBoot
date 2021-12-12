package com.gangbb.springbootconfig.conmon;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : lyx
 * @ClassName : GangbbConstant
 * @Description :
 * @Date : 2021/1/21 7:59
 */
@Component
public class GangbbConstant {

    public static String GANGBB_NAME;

    //在定义时使用配置文件属性
    @Value("${gangbb.info}")
    public String gangbbInfo;

    /**
     * 静态变量在set方法时使用配置文件属性
     * @param gangbbName
     */
    @Value("${gangbb.name}")
    public void setGangbbName(String gangbbName) {
        GANGBB_NAME = gangbbName;
    }

}
