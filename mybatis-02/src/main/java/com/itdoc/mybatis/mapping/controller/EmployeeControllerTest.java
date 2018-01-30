/**
 * @filename: EmployeeControllerTest.java
 * @desc 员工控制Controller
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-01-30 10:45
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180130   Wang Chinda   create
 * 20180130   Wang Chinda   modify   method()
 */
package com.itdoc.mybatis.mapping.controller;

import com.itdoc.mybatis.bc.dao.EmployeeMapper;
import com.itdoc.mybatis.bc.entity.EmployeeEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @desc 员工控制Controller
 * @author Wang Chinda
 * @create 2018-01-30 10:45
 */
public class EmployeeControllerTest {

    /**
     * 获取sqlSession
     * @return
     * @throws IOException
     */
    private SqlSession getSqlSession() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream input = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(input);
        return sessionFactory.openSession();
    }

    @Test
    public void testSelect() {
        SqlSession sqlSession = null;
        try {
            sqlSession = getSqlSession();
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeEntity emp = mapper.queryById("1");
            System.out.println(emp);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
