package com.itdoc.mybatis.handler;
/**
 * @filename: MybatisHandler.java
 * @author: Wang Chinda
 * @date: 2018-01-15
 * @version: v1.0
 * @copyright: Copyright © 2017 丿祸害苍生 版权所有
 * @modify_history: 20180115   Wang Chinda   create
 * 20180115   Wang Chinda   modify   method()
 */

import com.itdoc.mybatis.bean.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * MybatisHandler.java
 * <p>
 * <pre>
 *
 * Mybatis控制层, 测试类
 *
 * <pre>
 */
public class MybatisHandler {


    @Test
    public void getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream input = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        SqlSession openSession = sqlSessionFactory.openSession();
        try {

            Employee employee = openSession.selectOne("com.itdoc.mybatis.EmployeeMapper.selectEmp", 1);
            System.out.println(employee);

        } finally {
            openSession.close();
        }
    }
}
