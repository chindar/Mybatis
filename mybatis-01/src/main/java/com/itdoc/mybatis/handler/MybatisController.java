package com.itdoc.mybatis.handler;
/**
 * @filename: MybatisController.java
 * @author: Wang Chinda
 * @date: 2018-01-16
 * @version: v1.0
 * @copyright: Copyright © 2017 大连承远教育科技有限公司 版权所有
 * @modify_history: -
 * 20180116   Wang Chinda   create
 * 20180116   Wang Chinda   modify   method()
 */

import com.itdoc.mybatis.bean.Employee;
import com.itdoc.mybatis.dao.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * MybatisController.java
 *
 * <pre>
 *
 * 接口实现mybatis查询
 *
 * <pre>
 */
public class MybatisController {


    @Test
    public void testMybatis() throws IOException {
        SqlSession sqlSession = this.getSqlSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.getEmpById(1);
        System.out.println(employee);

    }

    /**
     * 获取SqlSession
     * @return
     */
    private SqlSession getSqlSession() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream input = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        return sqlSessionFactory.openSession();
    }
}
