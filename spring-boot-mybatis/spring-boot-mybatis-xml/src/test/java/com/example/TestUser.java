package com.example;

import com.example.enums.UserSexEnum;
import com.example.mapper.UserMapper;
import com.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUser {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void addUser() {
        User user = new User();
        user.setUserName("liu");
        user.setPassWord("6666");
        user.setUserSex(UserSexEnum.WOMAN);

        userMapper.insert(user);
    }
}
