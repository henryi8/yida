package com.github.zhaoxny.yida.common.exception.file;

import com.github.zhaoxny.yida.common.exception.BaseException;

/**
 * 文件信息异常类
 *
 * @Author Henry
 */
public class FileException extends BaseException {
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}
