package com.github.zhaoxny.yida.common.exception.user;

import com.github.zhaoxny.yida.common.exception.BaseException;

/**
 * 用户信息异常类
 *
 * @Author Henry
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }
}
