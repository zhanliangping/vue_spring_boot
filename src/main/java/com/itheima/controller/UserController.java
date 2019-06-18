package com.itheima.controller;

import antlr.PythonCharFormatter;
import com.itheima.domian.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @auther zhanliangping
 * @date 2019/6/16 22:01
 */
@RequestMapping(value = "user")
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/findAll")
    @ResponseBody
    public List<User> findAll() {
        List<User> userList = userService.findAll();
        return userList;
    }

//    @RequestMapping(value = "/findById")
//    public User findById(@RequestBody Integer id){
//        User user = userService.findOne(id);
//        return user;
//    }

    //使用restful接收id属性值
    @RequestMapping(value = "/findById/{id}")
    @ResponseBody
    public User findById(@PathVariable(value = "id") Integer id) {
        User user = userService.findOne(id);
        return user;
    }
    @RequestMapping(value = "/update")
    public void update(@RequestBody User user) {//// ajax传递json的字符串，json字符串转换成javabean
        userService.update(user);
    }

}
