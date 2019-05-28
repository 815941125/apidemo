package com.lf.demo.service;

import com.lf.demo.pojo.User;

import java.util.List;

/**
 * @author linfei
 * @version 1.0
 * @date 2019/5/28
 * @desc
 * @see
 * @since 1.0
 */
public interface UserService {

    List<User> getAll();

    User getOne(Integer id);

    void add(User user);

    void update(User user);

    void delete(Integer id);

    List<User> getByUsernameAndPassword(String username, String password);
}
