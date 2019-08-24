package com.tcwong.redis.controller;

import com.tcwong.redis.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Redis String数据 类型的操作
 * @author tcwong
 */
//@RestController
public class RedisDemoStringController {

    @Autowired
    private RedisTemplate redisTemplate ;

    /**
     * 添加数据
     */
    @PostMapping("/test1")
    public void test1() {
        User user = new User(1, "su", new Date());
        redisTemplate.opsForValue().set("name","su");
        redisTemplate.opsForValue().set("user",user);
    }

    /**
     * 添加数据，并设置过期时间
     */
    @PostMapping("/test2")
    public void test2() {
        redisTemplate.opsForValue().set("age",18,10000, TimeUnit.MILLISECONDS);
    }

    /**
     * 批量添加数据
     */
    @PostMapping("/test3")
    public void test3() {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("name", "susu");
        map.put("age", 18);
        map.put("address", "shanghai");
        redisTemplate.opsForValue().multiSet(map);
    }

    /**
     * 原子操作
     * @return
     */
    @PostMapping("/test4")
    public Long test4() {
        Long num = (Long) redisTemplate.opsForValue().getAndSet("num", 1);
        return num;
    }

    /**
     * 追加数据
     * @return
     */
    @PostMapping("/test5")
    public Integer test5() {
        Integer num = redisTemplate.opsForValue().append("name", "susu");
        return num;
    }

    /**
     * 获取数据
     * @return
     */
    @PostMapping("/test6")
    public User test6() {
        User user = (User) redisTemplate.opsForValue().get("user");
        return user;
    }

    /**
     * 批量获取数据
     * @return
     */
    @PostMapping("/test7")
    public List<Object> test7() {
        List<Object> list = new ArrayList<>();
        list.add("name");
        list.add("address");
        list.add("user");
        List listResult = redisTemplate.opsForValue().multiGet(list);
        return listResult;
    }

    /**
     * 自增元算
     * @return
     */
    @PostMapping("/test8")
    public Long test8() {
        Long num = redisTemplate.opsForValue().increment("num", 2);
        return num;
    }

    /**
     * 自减运算
     */
    @PostMapping("/test9")
    public void test9() {
        redisTemplate.opsForValue().decrement("num");
    }
}
