package com.github.zhaoxny.yida.ums.utils;

import com.github.zhaoxny.yida.common.constant.Constants;
import com.github.zhaoxny.yida.common.entity.ums.SysDictData;
import com.github.zhaoxny.yida.common.utils.SpringUtils;
import com.github.zhaoxny.yida.common.utils.StringUtils;
import com.github.zhaoxny.yida.redis.template.RedisUtil;

import java.util.Collection;
import java.util.List;

/**
 * 字典工具类
 *
 * @Author Henry
 */
public class DictUtils {
    /**
     * 设置字典缓存
     *
     * @param key       参数键
     * @param dictDatas 字典数据列表
     */
    public static void setDictCache(String key, List<SysDictData> dictDatas) {
        SpringUtils.getBean(RedisUtil.class).set(getCacheKey(key), dictDatas);
    }

    /**
     * 获取字典缓存
     *
     * @param key 参数键
     * @return dictDatas 字典数据列表
     */
    public static List<SysDictData> getDictCache(String key) {
        Object cacheObj = SpringUtils.getBean(RedisUtil.class).get(getCacheKey(key));
        if (StringUtils.isNotNull(cacheObj)) {
            List<SysDictData> dictDatas = StringUtils.cast(cacheObj);
            return dictDatas;
        }
        return null;
    }

    /**
     * 删除指定字典缓存
     *
     * @param key 字典键
     */
    public static void removeDictCache(String key) {
        SpringUtils.getBean(RedisUtil.class).delete(getCacheKey(key));
    }

    /**
     * 清空字典缓存
     */
    public static void clearDictCache() {
        Collection<String> keys = SpringUtils.getBean(RedisUtil.class).keys(Constants.SYS_DICT_KEY + "*");
        SpringUtils.getBean(RedisUtil.class).delete(keys);
    }

    /**
     * 设置cache key
     *
     * @param configKey 参数键
     * @return 缓存键key
     */
    public static String getCacheKey(String configKey) {
        return Constants.SYS_DICT_KEY + configKey;
    }
}
