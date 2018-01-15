package com.itdoc.mybatis.bean;
/**
 * @filename: Employee.java
 * @author: Wang Chinda
 * @date: 2018/1/15
 * @version: V1.0
 * @copyright: Copyright © 2017 丿祸害苍生 版权所有
 * @modify_history: 2018/1/15   Wang Chinda   create
 * 2018/1/15   Wang Chinda   modify   method()
 */

/**
 * Employee.java
 * <pre>
 *
 * 员工实体类
 *
 * </pre>
 */
public class Employee {

    /** id 主键 */
    private Integer id;
    /** 最后名称 */
    private String lastName;
    /** 邮箱 */
    private String email;
    /** 性别 */
    private String gender;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    /**
     * 重写toString
     * @return
     */
    @Override
    public String toString() {
        return "Employee [id=" + id + ", lastName=" + lastName + ", email="
                + email + ", gender=" + gender + "]";
    }


}
