/**
 * @filename: EmployeeMapper.java
 * @desc 数据库模型映射接口
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-01-30 10:15
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180130   Wang Chinda   create
 * 20180130   Wang Chinda   modify   method()
 */
package com.itdoc.mybatis.bc.dao;

import com.itdoc.mybatis.bc.entity.EmployeeEntity;
import com.itdoc.mybatis.common.base.dao.BaseDao;
import org.apache.ibatis.annotations.Param;

/**
 * @desc 数据库模型映射接口
 * @author Wang Chinda
 * @create 2018-01-30 10:15
 */
public interface EmployeeMapper extends BaseDao<EmployeeEntity> {

    /**
     * 根据id获取对象
     * 参数处理  单个参数
     * @param id
     * @return
     */
    EmployeeEntity selectById(String id);

    /**
     * 参数处理  多个参数
     * @param id
     * @param name
     * @return
     */
    EmployeeEntity selectByIdAndName(@Param("id") String id, @Param("name") String name);

}
