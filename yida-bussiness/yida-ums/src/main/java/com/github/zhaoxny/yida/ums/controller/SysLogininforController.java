package com.github.zhaoxny.yida.ums.controller;

import com.github.zhaoxny.yida.auth.annotation.PreAuthorize;
import com.github.zhaoxny.yida.common.constant.Constants;
import com.github.zhaoxny.yida.common.entity.ums.SysLogininfor;
import com.github.zhaoxny.yida.common.utils.ServletUtils;
import com.github.zhaoxny.yida.common.utils.ip.IpUtils;
import com.github.zhaoxny.yida.common.utils.poi.ExcelUtil;
import com.github.zhaoxny.yida.common.web.controller.BaseController;
import com.github.zhaoxny.yida.common.web.domain.AjaxResult;
import com.github.zhaoxny.yida.common.web.page.TableDataInfo;
import com.github.zhaoxny.yida.log.annotation.Log;
import com.github.zhaoxny.yida.log.enums.BusinessType;
import com.github.zhaoxny.yida.ums.service.ISysLogininforService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 系统访问记录
 *
 * @Author Henry
 */
@RestController
@RequestMapping("/logininfor")
public class SysLogininforController extends BaseController {
    @Autowired
    private ISysLogininforService logininforService;

    @PreAuthorize(hasPermi = "system:logininfor:list")
    @GetMapping("/list")
    public TableDataInfo list(SysLogininfor logininfor) {
        startPage();
        List<SysLogininfor> list = logininforService.selectLogininforList(logininfor);
        return getDataTable(list);
    }

    @Log(title = "登录日志", businessType = BusinessType.EXPORT)
    @PreAuthorize(hasPermi = "system:logininfor:export")
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysLogininfor logininfor) throws IOException {
        List<SysLogininfor> list = logininforService.selectLogininforList(logininfor);
        ExcelUtil<SysLogininfor> util = new ExcelUtil<SysLogininfor>(SysLogininfor.class);
        util.exportExcel(response, list, "登录日志");
    }

    @PreAuthorize(hasPermi = "system:logininfor:remove")
    @Log(title = "登录日志", businessType = BusinessType.DELETE)
    @DeleteMapping("/{infoIds}")
    public AjaxResult remove(@PathVariable Long[] infoIds) {
        return toAjax(logininforService.deleteLogininforByIds(infoIds));
    }

    @PreAuthorize(hasPermi = "system:logininfor:remove")
    @Log(title = "登录日志", businessType = BusinessType.DELETE)
    @DeleteMapping("/clean")
    public AjaxResult clean() {
        logininforService.cleanLogininfor();
        return AjaxResult.success();
    }

    @PostMapping
    public AjaxResult add(@RequestParam("username") String username, @RequestParam("status") String status,
                          @RequestParam("message") String message) {
        String ip = IpUtils.getIpAddr(ServletUtils.getRequest());

        // 封装对象
        SysLogininfor logininfor = new SysLogininfor();
        logininfor.setUserName(username);
        logininfor.setIpaddr(ip);
        logininfor.setMsg(message);
        // 日志状态
        if (Constants.LOGIN_SUCCESS.equals(status) || Constants.LOGOUT.equals(status)) {
            logininfor.setStatus("0");
        } else if (Constants.LOGIN_FAIL.equals(status)) {
            logininfor.setStatus("1");
        }
        return toAjax(logininforService.insertLogininfor(logininfor));
    }
}
