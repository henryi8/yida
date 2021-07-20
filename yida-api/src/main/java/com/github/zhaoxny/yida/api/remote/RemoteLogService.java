package com.github.zhaoxny.yida.api.remote;

import com.github.zhaoxny.yida.api.constants.ServiceNameConstants;
import com.github.zhaoxny.yida.api.factory.RemoteLogFallbackFactory;
import com.github.zhaoxny.yida.common.dto.R;
import com.github.zhaoxny.yida.common.entity.ums.SysOperLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 日志服务
 *
 * @Author Henry
 */
@FeignClient(contextId = "remoteLogService", value = ServiceNameConstants.YIDA_UMS, fallbackFactory = RemoteLogFallbackFactory.class)
public interface RemoteLogService {
    /**
     * 保存系统日志
     *
     * @param sysOperLog 日志实体
     * @return 结果
     */
    @PostMapping("/operlog")
    R<Boolean> saveLog(@RequestBody SysOperLog sysOperLog);

    /**
     * 保存访问记录
     *
     * @param username 用户名称
     * @param status   状态
     * @param message  消息
     * @return 结果
     */
    @PostMapping("/logininfor")
    R<Boolean> saveLogininfor(@RequestParam("username") String username, @RequestParam("status") String status,
                              @RequestParam("message") String message);
}
