package com.gangbb.gangbbspringbootlog.filter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import eu.bitwalker.useragentutils.Version;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;


/**
 * @author : Gangbb
 * @ClassName : WebLogAspect
 * @Description : 网络请求和响应过滤器
 * @Date : 2021/1/23 9:46
 */
@Aspect
@Component
public class WebLogAspect {
    /**
     * 定义一个log用于打印
     */
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    /**
     * 切入点
     */
    @Pointcut("execution(public * com.gangbb.gangbbspringbootlog.controller.*.*(..)))")
    public void weblog(){

    }

    @Before("weblog()")
    public void doBefore(JoinPoint joinPoint){
        //收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //获取当前请求
        HttpServletRequest request = attributes.getRequest();
        //获取浏览器信息
        String header = request.getHeader("User-Agent");
        //转成UserAgent对象
        UserAgent browser = UserAgent.parseUserAgentString(header);
        //获取浏览器版本号
        Version version = browser.getBrowser().getVersion(request.getHeader("User-Agent"));
        //获取系统信息
        OperatingSystem os = browser.getOperatingSystem();

        //记录真正的内容
        log.info("URL : " + request.getRequestURL().toString());
        log.info("HTTP_METHOD :" + request.getMethod());
        log.info("IP : " + request.getRemoteAddr());
        log.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "."
                + joinPoint.getSignature().getName());
        log.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));
        if(browser.getBrowser()!= null && version != null){
            log.info("BROWSER/VERSION : " + browser.getBrowser().getName() + "/" + version.getVersion());
        }
        if(os != null){
            log.info("OS_NAME : " + os.getName());
        }


    }

    /**
     * 拦截响应返回
     * @param res
     * @throws JsonProcessingException
     */
    @AfterReturning(returning = "res", pointcut = "weblog()")
    public void doAfterReturning(Object res) throws JsonProcessingException {
        //处理完请求，返回内容
        //new ObjectMapper()用于对象转json
        log.info("RESPONSE : " + new ObjectMapper().writeValueAsString(res));
    }
}
