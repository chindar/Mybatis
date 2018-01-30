/**
 * @filename: BaseDao.java
 * @desc 基础数据模型接口
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-01-30 10:35
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180130   Wang Chinda   create
 * 20180130   Wang Chinda   modify   method()
 */
package com.itdoc.mybatis.common.base.dao;

/**
 * @desc 基础数据模型接口
 * @author Wang Chinda
 * @create 2018-01-30 10:35
 */
public interface BaseDao<T> {

    /**
     * 根据对象保存数据
     * @param entity
     * @return
     */
    boolean insert(T entity);

    /**
     * 根据主键删除数据
     * @param id
     * @return
     */
    boolean delById(String id);

    /**
     * 根据对象删除数据
     * @param entity
     * @return
     */
    boolean del(T entity);

    /**
     * 根据主键更新数据
     * @param id
     * @return
     */
    boolean updateById(String id);

    /**
     * 根据对象更新数据
     * @param entity
     * @return
     */
    boolean update(T entity);

    /**
     * 根据主键查询数据
     * @param id
     * @return
     */
    T queryById(String id);
}
