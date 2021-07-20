package com.github.zhaoxny.yida.api.factory;

import com.github.zhaoxny.yida.api.remote.RemoteUserService;
import com.github.zhaoxny.yida.common.dto.R;
import com.github.zhaoxny.yida.common.dto.ums.LoginUserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * 用户服务降级处理
 *
 * @Author Henry
 */
@Component
public class RemoteUserFallbackFactory implements FallbackFactory<RemoteUserService> {
    private static final Logger log = LoggerFactory.getLogger(RemoteUserFallbackFactory.class);

    @Override
    public RemoteUserService create(Throwable throwable) {
        log.error("用户服务调用失败:{}", throwable.getMessage());
        return new RemoteUserService() {
            @Override
            public R<LoginUserVo> getUserInfo(String username) {
                return R.fail("获取用户失败:" + throwable.getMessage());
            }
        };
    }
}
