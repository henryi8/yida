package com.github.zhaoxny.yida.common.dto.user;

import lombok.Data;

/**
 * 用户登录对象
 *
 * @Author Henry
 */
@Data
public class LoginParam {
    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

}
