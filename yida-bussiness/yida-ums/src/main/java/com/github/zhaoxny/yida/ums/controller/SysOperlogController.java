package com.github.zhaoxny.yida.ums.controller;

import com.github.zhaoxny.yida.auth.annotation.PreAuthorize;
import com.github.zhaoxny.yida.common.entity.ums.SysOperLog;
import com.github.zhaoxny.yida.common.utils.poi.ExcelUtil;
import com.github.zhaoxny.yida.common.web.controller.BaseController;
import com.github.zhaoxny.yida.common.web.domain.AjaxResult;
import com.github.zhaoxny.yida.common.web.page.TableDataInfo;
import com.github.zhaoxny.yida.log.annotation.Log;
import com.github.zhaoxny.yida.log.enums.BusinessType;
import com.github.zhaoxny.yida.ums.service.ISysOperLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 操作日志记录
 *
 * @Author Henry
 */
@RestController
@RequestMapping("/operlog")
public class SysOperlogController extends BaseController {
    @Autowired
    private ISysOperLogService operLogService;

    @PreAuthorize(hasPermi = "system:operlog:list")
    @GetMapping("/list")
    public TableDataInfo list(SysOperLog operLog) {
        startPage();
        List<SysOperLog> list = operLogService.selectOperLogList(operLog);
        return getDataTable(list);
    }

    @Log(title = "操作日志", businessType = BusinessType.EXPORT)
    @PreAuthorize(hasPermi = "system:operlog:export")
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysOperLog operLog) throws IOException {
        List<SysOperLog> list = operLogService.selectOperLogList(operLog);
        ExcelUtil<SysOperLog> util = new ExcelUtil<SysOperLog>(SysOperLog.class);
        util.exportExcel(response, list, "操作日志");
    }

    @Log(title = "操作日志", businessType = BusinessType.DELETE)
    @PreAuthorize(hasPermi = "system:operlog:remove")
    @DeleteMapping("/{operIds}")
    public AjaxResult remove(@PathVariable Long[] operIds) {
        return toAjax(operLogService.deleteOperLogByIds(operIds));
    }

    @PreAuthorize(hasPermi = "system:operlog:remove")
    @Log(title = "操作日志", businessType = BusinessType.CLEAN)
    @DeleteMapping("/clean")
    public AjaxResult clean() {
        operLogService.cleanOperLog();
        return AjaxResult.success();
    }

    @PostMapping
    public AjaxResult add(@RequestBody SysOperLog operLog) {
        return toAjax(operLogService.insertOperlog(operLog));
    }
}
