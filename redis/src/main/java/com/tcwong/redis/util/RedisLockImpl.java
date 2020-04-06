package com.tcwong.redis.util;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

/**
 * redis锁
 */
public class RedisLockImpl implements RedisLock {

    private RedisTemplate redisTemplate;

    private String key;

    private long expireTime;

    private long tryTime;

    private long maxTryTime;

    private ValueOperations valueOperations;

    public RedisLockImpl(RedisTemplate redisTemplate, String key, Long expireTime, Long maxTryTime) {
        this.redisTemplate = redisTemplate;
        this.key = key;
        this.expireTime = expireTime;
        this.maxTryTime = maxTryTime;
        this.valueOperations = redisTemplate.opsForValue();
    }

    /**
     * 获取锁
     * @return
     */
    private boolean tryLock() {
        while (this.tryTime >= 0) {
            Long expires = System.currentTimeMillis() + this.expireTime ;
            String expiresValue = String.valueOf(expires);
            Boolean ifAbsentFlag = this.valueOperations.setIfAbsent(this.key, expiresValue);
            if (ifAbsentFlag) {
                redisTemplate.expire(this.key, this.expireTime, TimeUnit.MILLISECONDS);
                return true;
            }
            String lastTimeValue = (String)this.valueOperations.get(this.key);
            if (lastTimeValue != null && Long.valueOf(lastTimeValue) < System.currentTimeMillis()) {
                String oldTimeValue = (String) this.valueOperations.getAndSet(this.key, expiresValue);
                this.redisTemplate.expire(this.key, this.expireTime, TimeUnit.MILLISECONDS);
                if (oldTimeValue != null && oldTimeValue.equals(lastTimeValue)) {
                    return true;
                }
            }
            this.tryTime -= 100;

            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        return false;
    }

    /**
     * 获取锁
     * @param tryMillSecondsTime 尝试时长
     * @return
     */
    @Override
    public boolean tryLock(long tryMillSecondsTime) {
        this.tryTime = tryMillSecondsTime > this.maxTryTime ? maxTryTime : tryMillSecondsTime;
        return this.tryLock();
    }

    /**
     * 获取锁
     * @param tryTime 尝试时间
     * @param timeUnit 时间类型
     * @return
     */
    @Override
    public boolean tryLock(long tryTime, TimeUnit timeUnit) {
        return this.tryLock(timeUnit.toMillis(tryTime));
    }

    /**
     * 释放锁
     */
    @Override
    public void unLock() {
        this.redisTemplate.delete(this.key);
    }

    /**
     * 重制锁
     */
    @Override
    public void reInit() {
        this.redisTemplate.expire(this.key, 0 , TimeUnit.MILLISECONDS);
    }
}
