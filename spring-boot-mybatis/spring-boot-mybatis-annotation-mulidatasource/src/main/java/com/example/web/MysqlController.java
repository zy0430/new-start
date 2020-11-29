package com.example.web;

import com.example.enums.UserSexEnum;
import com.example.mapper.test1.User1Mapper;
import com.example.mapper.test2.User2Mapper;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysqlController {

    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    @RequestMapping("/add1")
    public void addUser1() {
        User user = new User();
        user.setUserName("test");
        user.setPassWord("123456");
        user.setUserSex(UserSexEnum.MAN);
        user1Mapper.inserUser(user);
    }

    @RequestMapping("/add2")
    public void addUser2() {
        User user = new User();
        user.setUserName("test");
        user.setPassWord("123456");
        user.setUserSex(UserSexEnum.MAN);
        user2Mapper.insert(user);
    }
}
