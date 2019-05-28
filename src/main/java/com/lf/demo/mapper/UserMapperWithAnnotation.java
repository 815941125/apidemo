package com.lf.demo.mapper;

import com.lf.demo.pojo.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/28
 * @desc
 * @see
 * @since 1.0
 */
public interface UserMapperWithAnnotation {

    @Select("select * from user")
    @Results({
            @Result(property = "username", column = "username", jdbcType = JdbcType.VARCHAR),
            @Result(property = "password", column = "password")
    })
    List<User> selectAll();

    @Select("select * from user where id = #{id}")
    @Results({
            @Result(property = "username", column = "username", jdbcType = JdbcType.VARCHAR),
            @Result(property = "password", column = "password")
    })
    User selectOne(Integer id);

    @Insert("insert into user(username, password) values(#{username}, #{password})")
    void insert(User user);

    @Update("update user set username=#{username}, password=#{password} where id = #{id}")
    void update(User user);

    @Delete("delete from user where id = #{id}")
    void delete(Integer id);
}
