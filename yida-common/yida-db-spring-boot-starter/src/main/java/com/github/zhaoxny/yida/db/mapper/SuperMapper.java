package com.github.zhaoxny.yida.db.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * dao 父类，注意这个类不要让 mp 扫描到！！
 *
 * @Author Henry
 */
public interface SuperMapper<T> extends BaseMapper<T> {
    // 这里可以放一些公共的方法
}
