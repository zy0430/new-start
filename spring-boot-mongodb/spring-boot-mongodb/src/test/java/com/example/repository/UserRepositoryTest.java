package com.example.repository;

import com.example.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

//    @Test
    public void saveUser() {
        User user = new User();
        user.setId(1L);
        user.setUserName("zhao");
        user.setPassWord("123456");
        userRepository.saveUser(user);
    }

//    @Test
    public void updateUser() {
        User user = new User();
        user.setId(1L);
        user.setPassWord("666666");
        user.setUserName("xxxxx");
        long count = userRepository.updateUser(user);
        System.out.println(count);
    }

//    @Test
    public void findUser() {
        User user = userRepository.findUserByUserName("xxxxx");
        System.out.println(user);
    }

    @Test
    public void deleteUser() {
        userRepository.deleteUserById(1L);
    }
}
