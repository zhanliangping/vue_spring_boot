package com.itheima.service;

import com.itheima.domian.User;

import java.util.List;

/**
 * @auther zhanliangping
 * @date 2019/6/16 21:51
 */

public interface UserService {

    public List<User> findAll();

    public User findOne(int id);

    public void update(User user);

}
