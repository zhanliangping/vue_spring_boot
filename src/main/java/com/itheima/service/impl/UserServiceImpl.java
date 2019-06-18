package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domian.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @auther zhanliangping
 * @date 2019/6/16 21:51
 */
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(int id) {
        return userDao.findOne(id);
    }

    @Override
    public void update(User user) {
        userDao.save(user);

    }
}
