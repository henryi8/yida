package com.github.zhaoxny.yida.ums.controller;

import com.github.zhaoxny.yida.auth.annotation.PreAuthorize;
import com.github.zhaoxny.yida.common.constant.CacheConstants;
import com.github.zhaoxny.yida.common.dto.ums.LoginUserVo;
import com.github.zhaoxny.yida.common.entity.ums.SysUserOnline;
import com.github.zhaoxny.yida.common.utils.StringUtils;
import com.github.zhaoxny.yida.common.web.controller.BaseController;
import com.github.zhaoxny.yida.common.web.domain.AjaxResult;
import com.github.zhaoxny.yida.common.web.page.TableDataInfo;
import com.github.zhaoxny.yida.log.annotation.Log;
import com.github.zhaoxny.yida.log.enums.BusinessType;
import com.github.zhaoxny.yida.redis.template.RedisUtil;
import com.github.zhaoxny.yida.ums.service.ISysUserOnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 在线用户监控
 *
 * @Author Henry
 */
@RestController
@RequestMapping("/online")
public class SysUserOnlineController extends BaseController {
    @Autowired
    private ISysUserOnlineService userOnlineService;

    @Autowired
    private RedisUtil redisUtil;

    @PreAuthorize(hasPermi = "monitor:online:list")
    @GetMapping("/list")
    public TableDataInfo list(String ipaddr, String userName) {
        Collection<String> keys = redisUtil.keys(CacheConstants.LOGIN_TOKEN_KEY + "*");
        List<SysUserOnline> userOnlineList = new ArrayList<SysUserOnline>();
        for (String key : keys) {
            LoginUserVo user = redisUtil.get(key);
            if (StringUtils.isNotEmpty(ipaddr) && StringUtils.isNotEmpty(userName)) {
                if (StringUtils.equals(ipaddr, user.getIpaddr()) && StringUtils.equals(userName, user.getUsername())) {
                    userOnlineList.add(userOnlineService.selectOnlineByInfo(ipaddr, userName, user));
                }
            } else if (StringUtils.isNotEmpty(ipaddr)) {
                if (StringUtils.equals(ipaddr, user.getIpaddr())) {
                    userOnlineList.add(userOnlineService.selectOnlineByIpaddr(ipaddr, user));
                }
            } else if (StringUtils.isNotEmpty(userName)) {
                if (StringUtils.equals(userName, user.getUsername())) {
                    userOnlineList.add(userOnlineService.selectOnlineByUserName(userName, user));
                }
            } else {
                userOnlineList.add(userOnlineService.loginUserToUserOnline(user));
            }
        }
        Collections.reverse(userOnlineList);
        userOnlineList.removeAll(Collections.singleton(null));
        return getDataTable(userOnlineList);
    }

    /**
     * 强退用户
     */
    @PreAuthorize(hasPermi = "monitor:online:forceLogout")
    @Log(title = "在线用户", businessType = BusinessType.FORCE)
    @DeleteMapping("/{tokenId}")
    public AjaxResult forceLogout(@PathVariable String tokenId) {
        redisUtil.delete(CacheConstants.LOGIN_TOKEN_KEY + tokenId);
        return AjaxResult.success();
    }
}
