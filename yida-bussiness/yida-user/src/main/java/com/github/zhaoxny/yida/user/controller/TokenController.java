package com.github.zhaoxny.yida.user.controller;

import com.github.zhaoxny.yida.auth.service.TokenService;
import com.github.zhaoxny.yida.common.dto.R;
import com.github.zhaoxny.yida.common.dto.ums.LoginUserVo;
import com.github.zhaoxny.yida.common.dto.user.LoginParam;
import com.github.zhaoxny.yida.common.utils.StringUtils;
import com.github.zhaoxny.yida.user.service.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * token 控制
 *
 * @Author Henry
 */
@RestController
public class TokenController {
    @Autowired
    private TokenService tokenService;

    @Autowired
    private SysLoginService sysLoginService;

    @PostMapping("login")
    public R<?> login(@RequestBody LoginParam form) {
        // 用户登录
        LoginUserVo userInfo = sysLoginService.login(form.getUsername(), form.getPassword());
        // 获取登录token
        Map<String, Object> token = tokenService.createToken(userInfo);
        return R.ok(token);
    }

    @DeleteMapping("logout")
    public R<?> logout(HttpServletRequest request) {
        LoginUserVo loginUser = tokenService.getLoginUser(request);
        if (StringUtils.isNotNull(loginUser)) {
            String username = loginUser.getUsername();
            // 删除用户缓存记录
            tokenService.delLoginUser(loginUser.getToken());
            // 记录用户退出日志
            sysLoginService.logout(username);
        }
        return R.ok();
    }

    @PostMapping("refresh")
    public R<?> refresh(HttpServletRequest request) {
        LoginUserVo loginUser = tokenService.getLoginUser(request);
        if (StringUtils.isNotNull(loginUser)) {
            // 刷新令牌有效期
            tokenService.refreshToken(loginUser);
            return R.ok();
        }
        return R.ok();
    }
}
