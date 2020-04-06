package com.tcwong.redis.util;

import java.util.concurrent.TimeUnit;

/**
 * 获取锁对象
 */
public interface RedisLockFactory {
    /**
     * 获取锁
     * @param key redis锁key
     * @return
     */
    RedisLock getLock(String key);

    /**
     * 获取锁
     * @param key redis锁key
     * @param tryTime 尝试时间
     * @param timeUnit 时间类型
     * @return
     */
    RedisLock getLock(String key, int tryTime, TimeUnit timeUnit);
}
