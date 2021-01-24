package com.gangbb.gangbbspringbootswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : Gangbb
 * @ClassName : SwaggerConfig
 * @Description :
 * @Date : 2021/1/24 9:47
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket1() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("group1");
    }
    @Bean
    public Docket docket2() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("group2");
    }
    @Bean
    public Docket docket3() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("group3");
    }


    @Bean
    public Docket api(Environment environment) {
        //设置要显示的Swagger环境
        Profiles profiles = Profiles.of("dev", "test");
        //获取项目环境：是生产环境还是发布环境
        boolean flag = environment.acceptsProfiles(profiles);
        return new Docket(DocumentationType.SWAGGER_2) // 指定api类型为swagger2
                .apiInfo(apiInfo()) // 用于定义api文档汇总信息
                .groupName("api")
                .enable(flag)//是否启用swagger，如果为false则swagger不能再浏览器中访问
                .select() //通过select()方法配置扫描接口,RequestHandlerSelectors配置如何扫描接口
                .apis(RequestHandlerSelectors.any())  // 指定扫描的controller包
                .paths(PathSelectors.any())       //通过paths()方法配置扫描接口,PathSelectors配置如何扫描接口
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Gangbb Swagger API")
                .description("Gangbb 的 Swagger UI")
                .contact(new Contact("Gangbb", "http://xxx.xxx.com/联系人访问链接", "949526365@qq.com"))
                .version("1.0.0")
                .termsOfServiceUrl("") // 网站地址
                .build();
    }
}
