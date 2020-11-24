package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.User;
import com.example.enums.UserSexEnum;
import com.example.mapper.UserMapper;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

//    @Test()
    public void insertUser() {
        User user = new User("zhang11", "123456", UserSexEnum.MAN);
        userMapper.insertUser(user);
    }

    @Test
    public void getOne() {
//        User user = userMapper.getOne(2l);
//        System.out.println(user.toString());

//        User user = new User();
//        user.setUserName("un");
//        user.setNickName("nn");
//        user.setId(2L);
//        userMapper.updateUser(user);

//        userMapper.deleteUser(2L);
        List<User> list = userMapper.getAll();
        for (User user : list) {
            System.out.println(user.toString());
        }
    }
}
