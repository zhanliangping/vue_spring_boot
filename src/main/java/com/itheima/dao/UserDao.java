package com.itheima.dao;

import com.itheima.domian.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
