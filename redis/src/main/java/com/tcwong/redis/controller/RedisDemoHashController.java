package com.tcwong.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Redis Hash数据 类型的操作
 */
@RestController
public class RedisDemoHashController {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 添加 key-value
     * @param key
     * @param hkey
     * @param hvalue
     */
    @PostMapping("/test1")
    public void test1(String key,String hkey, String hvalue) {
        redisTemplate.opsForHash().put(key,hkey,hvalue);
    }

    /**
     * 批量添加key-value
     * @param key
     */
    @PostMapping("/test2")
    public void test2(String key) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("num", 2);
        map.put("name", "susu");
        map.put("age", 18);
        redisTemplate.opsForHash().putAll(key, map);
    }

    /**
     * 获取 指定对象所有的 hash 值
     * @param key
     * @return
     */
    @PostMapping("/test3")
    public Map test3(String key) {
        Map entries = redisTemplate.opsForHash().entries(key);
        return entries;
    }

    /**
     * 获取指定对象的所有key
     * @param key
     * @return
     */
    @PostMapping("/test4")
    public Set test4(String key) {
        Set keys = redisTemplate.opsForHash().keys(key);
        return keys;
    }

    /**
     * 获取指定对象的所有value
     * @param key
     * @return
     */
    @PostMapping("/test5")
    public List test5(String key) {
        List values = redisTemplate.opsForHash().values(key);
        return values;
    }

    /**
     * 获取指定对象的指定 key 的 value
     * @param key
     * @param hkey
     * @return
     */
    @PostMapping("/test6")
    public Object test6(String key, String hkey) {
        Object o = redisTemplate.opsForHash().get(key, hkey);
        return o;
    }

    /**
     * 根据指定对象的key  删除value值
     * @param key
     * @param hkey
     * @return
     */
    @PostMapping("/test7")
    public Long test7(String key, String hkey) {
        Long delete = redisTemplate.opsForHash().delete(key, hkey);
        return delete;
    }

    /**
     * 获取指定对象的特定key 对应的value 的长度
     * @param key
     * @param hkey
     * @return
     */
    @PostMapping("/test8")
    public Long test8(String key, String hkey) {
        Long lengthOfValue = redisTemplate.opsForHash().lengthOfValue(key, hkey);
        return lengthOfValue;
    }
}
