package com.github.zhaoxny.yida.api.remote;

import com.github.zhaoxny.yida.api.constants.ServiceNameConstants;
import com.github.zhaoxny.yida.api.factory.RemoteUserFallbackFactory;
import com.github.zhaoxny.yida.common.dto.R;
import com.github.zhaoxny.yida.common.dto.ums.LoginUserVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 用户服务
 *
 * @Author Henry
 */
@FeignClient(contextId = "remoteUserService", value = ServiceNameConstants.YIDA_UMS, fallbackFactory = RemoteUserFallbackFactory.class)
public interface RemoteUserService {
    /**
     * 通过用户名查询用户信息
     *
     * @param username 用户名
     * @return 结果
     */
    @GetMapping(value = "/user/info/{username}")
    public R<LoginUserVo> getUserInfo(@PathVariable("username") String username);
}
