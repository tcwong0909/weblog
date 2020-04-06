package com.tcwong.redis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 获取锁对象
 */
@Component
public class RedisLockFactoryImpl implements RedisLockFactory {

    @Autowired
    private RedisTemplate redisTemplate;

    private long expireTime = 0 ;

    private long maxTryTime = 1000 ;

    private static final String REDIS_KEY_PRE = "REDIS_KEY_PRE";

    /**
     * 获取锁
     * @param key redis锁key
     * @return
     */
    @Override
    public RedisLock getLock(String key) {
        return new RedisLockImpl(this.redisTemplate,REDIS_KEY_PRE + key,this.expireTime,this.maxTryTime);
    }

    /**
     * 获取锁
     * @param key redis锁key
     * @param tryTime 尝试时间
     * @param timeUnit 时间类型
     * @return
     */
    @Override
    public RedisLock getLock(String key, int tryTime, TimeUnit timeUnit) {
        return new RedisLockImpl(this.redisTemplate, REDIS_KEY_PRE + key,timeUnit.toMillis(tryTime),this.maxTryTime);
    }
}
