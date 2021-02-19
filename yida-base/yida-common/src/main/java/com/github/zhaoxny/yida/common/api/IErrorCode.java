package com.github.zhaoxny.yida.common.api;

/**
 * 封装API的错误码
 * @Author Henry
 * @Date 2021年2月18日 10:04:06
 */
public interface IErrorCode {

    long getCode();

    String getMessage();
}
