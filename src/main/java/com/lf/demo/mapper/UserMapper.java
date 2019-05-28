package com.lf.demo.mapper;

import com.lf.demo.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/28
 * @desc
 * @see
 * @since 1.0
 */
public interface UserMapper {

    List<User> selectAll();

    User selectOne(Integer id);

    void insert(User user);

    void update(User user);

    void delete(Integer id);

    List<User> selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
