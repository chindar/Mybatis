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
 *
 * <pre>
 *
 * Mybatis控制层, 测试类
 *
 * <pre>
 */
public class MybatisHandler {

    /**
     * 1.根据mybatis-config.xml配置文件(全局配置文件)创建一个SqlSessionFactory对象, 包含数据源信息
     * 2.sql映射文件, 封装了每一个sql及sql的封装规则
     * 3.将sql映射文件注册在全局配置文件中
     * 4.实现逻辑：
     *      1).根据全局配置文件获取SqlSessionFactory
     *      2).使用sqlSessionFactory工厂获取sqlSession对象, 使用它来做增删改查;一个sqlSession就代表和数据库的一次会话, 用完记得关闭
     *      3).使用sql的唯一标识,确定执行哪个具体sql, sql语句都保存在sql映射文件中
     * @throws IOException
     */
    @Test
    public void getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream input = Resources.getResourceAsStream(resource);
        // 获取SqlSessionFactory 对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        // 获取sqlSession对象, 一个sqlSession就代表和数据库的一次会话, 用完关闭。
        SqlSession openSession = sqlSessionFactory.openSession();
        try {
            Employee employee = openSession.selectOne("com.itdoc.mybatis.EmployeeMapper.selectEmp", 1);
            /* 如果sql语句中不用as lastName(对应实体类中的属性名)替换last_name 字段, employee对象lastName属性为null */
            System.out.println(employee);

        } finally {
            openSession.close();
        }
    }
}
