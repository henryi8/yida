package com.github.zhaoxny.yida.common.enums;

/**
 * 成功&失败枚举
 * @Author: Henry
 */
public enum CodeEnum {
    SUCCESS(200),
    ERROR(1);

    private Integer code;
    CodeEnum(Integer code){
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
