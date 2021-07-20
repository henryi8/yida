package com.github.zhaoxny.yida.api.remote;

import com.github.zhaoxny.yida.api.constants.ServiceNameConstants;
import com.github.zhaoxny.yida.api.factory.RemoteFileFallbackFactory;
import com.github.zhaoxny.yida.common.dto.R;
import com.github.zhaoxny.yida.common.entity.ums.SysFile;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件服务
 *
 * @Author Henry
 */
@FeignClient(contextId = "remoteFileService", value = ServiceNameConstants.FILE_SERVICE, fallbackFactory = RemoteFileFallbackFactory.class)
public interface RemoteFileService {
    /**
     * 上传文件
     *
     * @param file 文件信息
     * @return 结果
     */
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public R<SysFile> upload(@RequestPart(value = "file") MultipartFile file);
}
