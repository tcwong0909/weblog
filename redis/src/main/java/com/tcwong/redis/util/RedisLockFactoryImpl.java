package com.tcwong.redis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisLockFactoryImpl implements RedisLockFactory {

    @Autowired
    private RedisTemplate redisTemplate;

    private long expireTime = 0 ;

    private long maxTryTime = 1000 ;

    @Override
    public RedisLock getLock(String key) {
        return new RedisLockImpl(this.redisTemplate,key,this.expireTime,this.maxTryTime);
    }

    @Override
    public RedisLock getLock(String key, int tryTime, TimeUnit timeUnit) {
        return new RedisLockImpl(this.redisTemplate, key,timeUnit.toMillis(tryTime),this.maxTryTime);
    }
}
