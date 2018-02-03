**参数处理**
单个参数: mybatis不会做特殊处理
    #{key}: key可以写任何字段取出参数值

多个参数:mybatis会做特殊处理, 将多个参数封装成一个map
    #{key}: key为param1……paramN或者参数的索引。
            value为传入参数的真实值。
            
注意: 若key的值不为param1……paramN或者参数的索引会抛出异常。即执行"EmployeeEntity selectByIdAndName(String id, String name);"方法,
且用 id = #{id}、last_name = #{name} 取值时会抛出异常。
org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: org.apache.ibatis.binding.BindingException: Parameter 'id' not found. Available parameters are [0, 1, param1, param2]
### Cause: org.apache.ibatis.binding.BindingException: Parameter 'id' not found. Available parameters are [0, 1, param1, param2]

多个参数时推荐使用命名参数
命名参数: 明确的指定mybatis将多个参数封装成一个map时key的值。
    #{key}: key为使用@Param("key") 注解指定key的值。
            value为传入参数的真实值。
            

