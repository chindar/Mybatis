package com.itdoc.mybatis.dao;
/**
 * @filename: EmployeeMapper.java
 * @author: Wang Chinda
 * @date: 2018/1/15
 * @version: V1.0
 * @copyright: Copyright © 2017 大连承远教育科技有限公司 版权所有
 * @modify_history:
 * 2018/1/15   Wang Chinda   create
 * 2018/1/15   Wang Chinda   modify   method()
 */

import com.itdoc.mybatis.bean.Employee;
/**
 * EmployeeMapper.java
 * <pre>
 * 
 * 
 *
 * </pre>
 */
public interface EmployeeMapper {
	
	Employee getEmpById(Integer id);

}
