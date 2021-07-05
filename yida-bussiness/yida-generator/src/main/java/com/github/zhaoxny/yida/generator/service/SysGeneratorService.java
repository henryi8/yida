package com.github.zhaoxny.yida.generator.service;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器接口
 *
 * @Author Henry
 * @Date 2021年2月10日 11:18:56
 */
public interface SysGeneratorService {

    List<Map<String, Object>> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    Map<String, String> queryTable(String tableName);

    List<Map<String, String>> queryColumns(String tableName);

    byte[] generatorCode(String[] tableNames);

}
