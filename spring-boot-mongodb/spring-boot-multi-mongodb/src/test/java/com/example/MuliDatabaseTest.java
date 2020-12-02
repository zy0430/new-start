package com.example;

import com.example.model.User;
import com.example.repository.primary.PrimaryRepository;
import com.example.repository.secondary.SecondaryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MuliDatabaseTest {
    @Autowired
    PrimaryRepository primaryRepository;

    @Autowired
    SecondaryRepository secondaryRepository;

    @Test
    public void mongoTest() {
        primaryRepository.save(new User("xz", "123456"));
        secondaryRepository.save(new User("xz", "123456"));

        List<User> users = primaryRepository.findAll();
        for (User user : users) {
            System.out.println(user.toString());
        }

        List<User> users2 = secondaryRepository.findAll();
        for (User user : users2) {
            System.out.println(user.toString());
        }
    }
}
