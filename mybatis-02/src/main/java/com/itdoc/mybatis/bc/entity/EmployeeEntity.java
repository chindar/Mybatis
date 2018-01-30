/**
 * @filename: EmployeeEntity.java
 * @desc 数据库模型映射实体类
 * @author: Wang Chinda
 * @blog http://www.cnblogs.com/goodcheap
 * @date: 2018-01-30 10:18
 * @version: v1.0
 * @copyright: Copyright © 2018 ༄ྂ祸ྂྂ害ོ༘苍ྂྂ生ོ༘࿐ྂ 版权所有
 * @modify_history: -
 * 20180130   Wang Chinda   create
 * 20180130   Wang Chinda   modify   method()
 */
package com.itdoc.mybatis.bc.entity;

/**
 * @desc 数据库模型映射实体类
 * @author Wang Chinda
 * @create 2018-01-30 10:18
 */
public class EmployeeEntity {

    /** 主键 */
    private String id;
    /** 员工姓名 */
    private String name;
    /** 员工邮箱 */
    private String email;
    /** 员工性别 */
    private String gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
