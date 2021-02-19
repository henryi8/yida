package com.github.zhaoxny.yida.common.exception;


import com.github.zhaoxny.yida.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 * @Author Henry
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
