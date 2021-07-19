package com.github.zhaoxny.yida.common.exception;

/**
 * 验证码错误异常类
 *
 * @Author Henry
 */
public class CaptchaException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public CaptchaException(String msg) {
        super(msg);
    }
}
