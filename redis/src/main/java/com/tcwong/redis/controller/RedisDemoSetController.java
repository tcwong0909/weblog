package com.tcwong.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Redis Set数据 类型的操作
 */
//@RestController
public class RedisDemoSetController {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 添加set类型，并且如果存在的key-value，则不会重复再添加
     *
     * @param key
     * @param object
     * @return
     */
    @PostMapping("/test1")
    public Long test1(String key, Object object) {
        Long add = redisTemplate.opsForSet().add(key, object);
        return add;
    }

    /**
     * 比较两个集合的不同值，并返回第一个key 的 所有不同值
     *
     * @param key1
     * @param key2
     * @return
     */
    @PostMapping("/test2")
    public Set test2(String key1, String key2) {
        Set difference = redisTemplate.opsForSet().difference(key1, key2);
        return difference;
    }

    /**
     * 第一个集合 和 多个集合 比较，并返回第一个集合 不同的值Set
     *
     * @return
     */
    @PostMapping("/test3")
    public Set test3() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("name");
        list.add("user");
        Set number = redisTemplate.opsForSet().difference("num", list);
        return number;
    }

    /**
     * 比较第一个和第二个集合的差值，并把第一个集合的差值添加至第三个里面
     *
     * @param key1
     * @param key2
     * @param key3
     * @return
     */
    @PostMapping("/test4")
    public Long test4(String key1, String key2, String key3) {
        Long aLong = redisTemplate.opsForSet().differenceAndStore(key1, key2, key3);
        return aLong;
    }

    /**
     * 随机返回指定集合中的指定数量的值
     *
     * @param key
     * @param index
     * @return
     */
    @PostMapping("/test5")
    public Set test5(String key, Long index) {
        Set set = redisTemplate.opsForSet().distinctRandomMembers(key, index);
        return set;
    }

    /**
     * 两个集合的交集
     *
     * @param key1
     * @param key2
     * @return
     */
    @PostMapping("/test6")
    public Set test6(String key1, String key2) {
        Set set = redisTemplate.opsForSet().intersect(key1, key2);
        return set;
    }

    /**
     * 集合2和集1的交集，并把交集添加至集合3
     *
     * @param key1
     * @param key2
     * @param key3
     * @return
     */
    @PostMapping("/test7")
    public Long test7(String key1, String key2, String key3) {
        Long aLong = redisTemplate.opsForSet().intersectAndStore(key1, key2, key3);
        return aLong;
    }

    /**
     * 集合的并集
     *
     * @param key1
     * @param key2
     * @return
     */
    @PostMapping("/test8")
    public Set test8(String key1, String key2) {
        Set union = redisTemplate.opsForSet().union(key1, key2);
        return union;
    }

    /**
     * 集合1和集合2的并集，并添加至集合3
     *
     * @param key1
     * @param key2
     * @param key3
     * @return
     */
    @PostMapping("/test9")
    public Long test9(String key1, String key2, String key3) {
        Long aLong = redisTemplate.opsForSet().unionAndStore(key1, key2, key3);
        return aLong;
    }

    /**
     * 返回指定集合的所有值
     *
     * @param key
     * @return
     */
    @PostMapping("/test10")
    public Set test10(String key) {
        Set members = redisTemplate.opsForSet().members(key);
        return members;
    }

    /**
     * 判断指定集合中是否有指定value
     *
     * @param key
     * @param value
     * @return
     */
    @PostMapping("/test11")
    public Boolean test11(String key, String value) {
        Boolean aBoolean = redisTemplate.opsForSet().isMember(key, value);
        return aBoolean;
    }

    /**
     * 将指定集合的值移动至集合2
     *
     * @param key1
     * @param value
     * @param key2
     * @return
     */
    @PostMapping("/test12")
    public Boolean test12(String key1, String value, String key2) {
        Boolean aBoolean = redisTemplate.opsForSet().move(key1, value, key2);
        return aBoolean;
    }

    /**
     * 随机返回指定集合的一个值
     *
     * @param key
     * @return
     */
    @PostMapping("/test13")
    public Object test13(String key) {
        Object o = redisTemplate.opsForSet().randomMember(key);
        return o;
    }

    /**
     * 随机返回指定集合中的指定数量的值
     *
     * @param key
     * @param num
     * @return
     */
    @PostMapping("/test14")
    public List test14(String key, Long num) {
        List list = redisTemplate.opsForSet().randomMembers(key, num);
        return list;
    }

    /**
     * 随机弹出指定集合的一个值
     *
     * @param key
     * @return
     */
    @PostMapping("/test15")
    public Object test15(String key) {
        Object pop = redisTemplate.opsForSet().pop(key);
        return pop;
    }

    /**
     * 随机弹出指定集合的指定数量的值
     *
     * @param key
     * @param num
     * @return
     */
    @PostMapping("/test16")
    public List test16(String key, Long num) {
        List pop = redisTemplate.opsForSet().pop(key, num);
        return pop;
    }
}
