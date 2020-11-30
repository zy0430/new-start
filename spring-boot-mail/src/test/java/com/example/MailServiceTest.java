package com.example;

import com.example.impl.MailServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {

    @Autowired
    MailService mailService;

    @Test
    public void sendMail() {
        mailService.sendSimpleMail("z6488834134@163.com", "test simple mail", " hello this is simple mail");
    }
}
