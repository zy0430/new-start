package com.example;

import com.example.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

//    @Test
    public void test() throws Exception{
        stringRedisTemplate.opsForValue().set("bbb", "111");
//        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("bbb"));
    }

    @Test
    public void testObj() throws InterruptedException {
        User user = new User("zhang", "123456", "z@123.com", "z", "2020");
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        operations.set("a1", user);
        operations.set("a12", user, 1, TimeUnit.SECONDS);
        Thread.sleep(1000);
        boolean exists = redisTemplate.hasKey("a1");
        if (exists) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
}
