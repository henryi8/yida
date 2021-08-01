package com.github.zhaoxny.yida.gateway.service;


import com.github.zhaoxny.yida.common.exception.CaptchaException;
import com.github.zhaoxny.yida.common.web.domain.AjaxResult;

import java.io.IOException;

/**
 * 验证码处理
 *
 * @Author Henry
 */
public interface ValidateCodeService {
    /**
     * 生成验证码
     */
    public AjaxResult createCapcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    public void checkCapcha(String key, String value) throws CaptchaException;
}
