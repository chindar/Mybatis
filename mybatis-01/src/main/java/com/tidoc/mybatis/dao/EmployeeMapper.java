package com.tidoc.mybatis.dao;
/**
 * @filename: EmployeeMapper.java
 * @author: Wang Chinda
 * @date: 2018/1/15
 * @version: V1.0
 * @copyright: Copyright © 2017 丿祸害苍生 版权所有
 * @modify_history:
 * 2018/1/15   Wang Chinda   create
 * 2018/1/15   Wang Chinda   modify   method()
 */


import com.tidoc.mybatis.bean.Employee;

/**
 * EmployeeMapper.java
 * <pre>
 *
 * 员工mapper
 *
 * </pre>
 */
public interface EmployeeMapper {
	
	Employee getEmpById(Integer id);

}
