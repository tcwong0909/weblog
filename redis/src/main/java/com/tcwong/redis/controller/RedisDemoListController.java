package com.tcwong.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Redis List数据 类型的操作
 *
 * @author tcwong
 */
@RestController
public class RedisDemoListController {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 向列表左侧添加数据
     * @param name
     */
    @PostMapping("/test1")
    public void test1(String name) {
        Long leftPush = redisTemplate.opsForList().leftPush("name", name);
    }

    /**
     * 向列表右侧添加数据
     * @param name
     */
    @PostMapping("/test2")
    public void test2(String name) {
        Long rightPush = redisTemplate.opsForList().rightPush("name", name);
    }

    /**
     * 向列表左侧批量添加数据
     */
    @PostMapping("/test3")
    public void test3() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("shanghai");
        list.add("shenzhen");
        list.add("beijing");
        redisTemplate.opsForList().leftPushAll("address", list);
    }

    /**
     * 查询列表中指定索引的值
     * @param index
     * @return
     */
    @PostMapping("/test4")
    public Object test4(Long index) {
        Object name = redisTemplate.opsForList().index("name", index);
        return name;
    }

    /**
     * 查询列表指定范围内的值
     * @param key
     * @param sIndex
     * @param eIndex
     * @return
     */
    @PostMapping("/test5")
    public List test5(String key, Long sIndex, Long eIndex) {
        List range = redisTemplate.opsForList().range(key, sIndex, eIndex);
        return range;
    }

    /**
     * 修改列表中 指定索引的值
     * @param key
     * @param index
     * @param object
     */
    @PostMapping("/test6")
    public void test6(String key, Long index, Object object) {
        redisTemplate.opsForList().set(key, index, object);
    }

    /**
     * 截取列表中指定范围内的值
     * @param key
     * @param sIndex
     * @param eIndex
     */
    @PostMapping("/test7")
    public void test7(String key, Long sIndex, Long eIndex) {
        redisTemplate.opsForList().trim(key, sIndex, eIndex);
    }

    /**
     * 移除列表中指定索引和指定值
     * @param key
     * @param index
     * @param object
     * @return
     */
    @PostMapping("/test8")
    public Long test8(String key, Long index, Object object) {
        Long remove = redisTemplate.opsForList().remove(key, index, object);
        return remove;
    }

    /**
     * 弹出列表左侧的值
     * @param key
     * @return
     */
    @PostMapping("/test9")
    public Object test9(String key) {
        Object o = redisTemplate.opsForList().leftPop(key);
        return o;
    }

    /**
     * 弹出列表右侧的值
     * @param key
     * @param time
     * @return
     */
    @PostMapping("/test10")
    public Object test10(String key, Long time) {
        Object o = redisTemplate.opsForList().rightPop(key, time, TimeUnit.MILLISECONDS);
        return o;
    }

    /**
     * 弹出指定列表右侧的值，并把值添加到另一指定列表的左侧
     * @param key1
     * @param key2
     * @param time
     * @return
     */
    @PostMapping("/test11")
    public Object test11(String key1, String key2, Long time) {
        Object o = redisTemplate.opsForList().rightPopAndLeftPush(key1, key2, time, TimeUnit.SECONDS);
        return o;
    }
}
