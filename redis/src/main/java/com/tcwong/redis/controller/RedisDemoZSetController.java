package com.tcwong.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisZSetCommands;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

/**
 * Redis ZSet数据 类型的操作
 */
@RestController
public class RedisDemoZSetController {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 添加数据 并按score 排序  有相同的key-value score 会累加
     *
     * @param key
     * @param value
     * @param score
     * @return
     */
    @PostMapping("/test1")
    public Boolean test1(String key, String value, Double score) {
        Boolean aBoolean = redisTemplate.opsForZSet().add(key, value, score);
        return aBoolean;
    }

//    @PostMapping("/test2")
//    public Long test2() {
//        HashSet<Object> set = new HashSet<>();
//        set.add("name");
//        set.add("kang");
//        set.add("an");
//        Long aLong = redisTemplate.opsForZSet().add("peopel", set);
//        return aLong;
//    }

    /**
     * 在指定排序范围内 集合的值数量
     *
     * @param key
     * @param score1
     * @param score2
     * @return
     */
    @PostMapping("/test3")
    public Long test3(String key, Double score1, Double score2) {
        Long count = redisTemplate.opsForZSet().count(key, score1, score2);
        return count;
    }

    /**
     * 集合内指定值 排序值增加
     *
     * @param key
     * @param value
     * @param score
     * @return
     */
    @PostMapping("/test4")
    public Double test4(String key, String value, Double score) {
        Double aDouble = redisTemplate.opsForZSet().incrementScore(key, value, score);
        return aDouble;
    }

    /**
     * 集合1和集合2交集，并将交集排序值 相加
     *
     * @param key1
     * @param key2
     * @param key3
     * @return
     */
    @PostMapping("/test5")
    public Long test5(String key1, String key2, String key3) {
        Long aLong = redisTemplate.opsForZSet().intersectAndStore(key1, key2, key3);
        return aLong;
    }

    /**
     * 指定下标范围内的集合值，第一个值下标为0，最后一个为-1
     *
     * @param key
     * @param sIndex
     * @param eIndex
     * @return
     */
    @PostMapping("/test6")
    public Set test6(String key, Long sIndex, Long eIndex) {
        Set set = redisTemplate.opsForZSet().range(key, sIndex, eIndex);
        return set;
    }

//    @PostMapping("/test7")
//    public Set test7(String key, Double min, Double max) {
//        RedisZSetCommands.Range range = new RedisZSetCommands.Range();
//        RedisZSetCommands.Range gt = range.gt(min);
//        RedisZSetCommands.Range lt = range.lt(max);
//        Set set = redisTemplate.opsForZSet().rangeByLex(key, range);
//        return set;
//    }

    /**
     * 指定排序范围内的集合值
     *
     * @param key
     * @param sScore
     * @param eScore
     * @return
     */
    @PostMapping("/test8")
    public Set test8(String key, Double sScore, Double eScore) {
        Set set = redisTemplate.opsForZSet().rangeByScore(key, sScore, eScore);
        return set;
    }

    @PostMapping("/test9")
    public Long test9(String key1, String key2, String key3) {
        Long aLong = redisTemplate.opsForZSet().intersectAndStore(key1, key2, key3);
        return aLong;
    }

    /**
     * 集合中指定值的下标
     *
     * @param key
     * @param value
     * @return
     */
    @PostMapping("/test10")
    public Long test10(String key, String value) {
        Long rank = redisTemplate.opsForZSet().rank(key, value);
        return rank;
    }

    /**
     * 移除集合中指定值
     *
     * @param key
     * @param value
     * @return
     */
    @PostMapping("/test11")
    public Long test11(String key, String value) {
        Long remove = redisTemplate.opsForZSet().remove(key, value);
        return remove;
    }


    /**
     * 移除集合中指定下标范围内的值
     *
     * @param key
     * @param sIndex
     * @param eIndex
     * @return
     */
    @PostMapping("/test12")
    public Long test12(String key, Long sIndex, Long eIndex) {
        Long aLong = redisTemplate.opsForZSet().removeRange(key, sIndex, eIndex);
        return aLong;
    }

    /**
     * 移除集合中指定排序范围内的值
     *
     * @param key
     * @param sScore
     * @param eDouble
     * @return
     */
    @PostMapping("/test13")
    public Long test13(String key, Double sScore, Double eDouble) {
        Long aLong = redisTemplate.opsForZSet().removeRangeByScore(key, sScore, eDouble);
        return aLong;
    }

    /**
     * 反向获取指定集合中的指定范围值
     *
     * @param key
     * @param sIndex
     * @param eIndex
     * @return
     */
    @PostMapping("/test14")
    public Set test14(String key, Long sIndex, Long eIndex) {
        Set set = redisTemplate.opsForZSet().reverseRange(key, sIndex, eIndex);
        return set;
    }

    /**
     * 集合的并集添加至新集合，重叠的value, 排序值相加
     *
     * @param key1
     * @param key2
     * @param key3
     * @return
     */
    @PostMapping("/test15")
    public Long test15(String key1, String key2, String key3) {
        Long aLong = redisTemplate.opsForZSet().unionAndStore(key1, key2, key3);
        return aLong;
    }

}
