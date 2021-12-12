package com.gangbb.springbootexception.common;


import com.gangbb.springbootexception.exception.ApiExceptionEnum;

/**
 * @author : Gangbb
 * @ClassName : ApiRestResponse
 * @Description : 统一返回对象
 * @Date : 2021/1/22 22:42
 */
public class ApiRestResponse<T> {
    private Integer status;

    private String msg;

    private T data;

    private static final int OK_CODE = 20000;

    private static final String OK_MSG = "SUCCESS";

    public ApiRestResponse(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ApiRestResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public ApiRestResponse() {
        this(OK_CODE, OK_MSG);
    }

    /**
     * 无返回值返回
     * @param <T> 类型
     * @return ApiRestResponse对象
     */
    public static <T> ApiRestResponse<T> success() {
        return new ApiRestResponse<>();
    }

    /**
     * 请求成功带返回值
     * @param result 返回值中的data信息
     * @param <T> 类型
     * @return ApiRestResponse对象
     */
    public static <T> ApiRestResponse<T> success(T result) {
        ApiRestResponse<T> response = new ApiRestResponse<>();
        response.setData(result);
        return response;
    }

    /**
     * 失败时返回
     * @param code 状态码
     * @param msg  错误信息
     * @param <T> 类型
     * @return ApiRestResponse对象
     */
    public static <T> ApiRestResponse<T> error(Integer code, String msg) {
        return new ApiRestResponse<>(code, msg);
    }

    /**
     *  通过枚举返回错误信息
     * @param exceptionEnum 错误码枚举
     * @param <T> 类型
     * @return ApiRestResponse对象
     */
    public static <T> ApiRestResponse<T> error(ApiExceptionEnum exceptionEnum) {
        return new ApiRestResponse<>(exceptionEnum.getCode(), exceptionEnum.getMsg());
    }

    @Override
    public String toString() {
        return "ApiRestResponse{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static int getOkCode() {
        return OK_CODE;
    }

    public static String getOkMsg() {
        return OK_MSG;
    }
}
