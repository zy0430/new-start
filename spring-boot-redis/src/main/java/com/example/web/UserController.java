package com.example.web;

import com.example.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    @Cacheable("abc")
    public User getUser() {
        User user = new User("aa@126.com", "aa", "aa123456", "aa","123");
        System.out.println("缓存中无此数据");
        return user;
    }

    @RequestMapping("/uid1")
    public String uid(HttpSession httpSession) {
        UUID uuid = (UUID) httpSession.getAttribute("uid");
        System.out.println("uid：" + httpSession.getAttribute("uid"));
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        System.out.println(httpSession.getLastAccessedTime());

        httpSession.setAttribute("uid", uuid);
        return httpSession.getId();
    }
}
