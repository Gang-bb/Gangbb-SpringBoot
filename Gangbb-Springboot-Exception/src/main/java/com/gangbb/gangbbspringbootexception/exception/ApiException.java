package com.gangbb.gangbbspringbootexception.exception;

/**
 * @author : Gangbb
 * @ClassName : ApiException
 * @Description : 统一异常返回类
 * @Date : 2021/1/23 10:03
 */
public class ApiException extends RuntimeException{
    private final Integer code;
    private final String message;

    public ApiException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiException(ApiExceptionEnum exceptionEnum) {
        this(exceptionEnum.getCode(), exceptionEnum.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
