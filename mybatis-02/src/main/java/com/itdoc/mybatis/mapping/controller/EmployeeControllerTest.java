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
     * @param commitStatus 是否自动提交 ture: 自动 false: 手动
     * @return
     * @throws IOException
     */
    private SqlSession getSqlSession(boolean commitStatus) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream input = Resources.getResourceAsStream(resource);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(input);
        return sessionFactory.openSession(commitStatus);
    }

    /**
     * 测试查询
     */
    @Test
    public void testSelect() {
        SqlSession sqlSession = null;
        try {
            sqlSession = getSqlSession(false);
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeEntity emp = mapper.queryById("1");
            System.out.println(emp);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * 测试新增
     */
    @Test
    public void testInsert() {
        SqlSession sqlSession = null;
        try {
            // 传参ture为自动提交, false为手动提交
            sqlSession = getSqlSession(false);
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeEntity emp = new EmployeeEntity();
            emp.setName("李斯");
            emp.setEmail("lisi@163.com");
            emp.setGender("1");
            mapper.insert(emp);
            // 若获取sqlSession时传递参数为false, 此处应该手动提交
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * 测试修改
     */
    @Test
    public void testUpdate() {
        SqlSession sqlSession = null;
        try {
            sqlSession = getSqlSession(true);
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeEntity emp = new EmployeeEntity();
            emp.setId("1");
            emp.setName("王二");
            emp.setEmail("wer@163.com");
            emp.setGender("0");
            mapper.update(emp);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * 测试删除
     */
    @Test
    public void testDelete() {
        SqlSession sqlSession = null;
        try {
            sqlSession = getSqlSession(true);
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            mapper.delById("1");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * 单参数处理
     */
    @Test
    public void onlyParamTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = getSqlSession(false);
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeEntity emp = mapper.selectById("1");
            System.out.println(emp);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    /**
     * 多参数处理
     */
    @Test
    public void multiParamTest() {
        SqlSession sqlSession = null;
        try {
            sqlSession = getSqlSession(false);
            EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
            EmployeeEntity emp = mapper.selectByIdAndName("1", "李斯");
            System.out.println(emp);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
