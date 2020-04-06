package com.tcwong.redis.util;

import java.util.concurrent.TimeUnit;

/**
 * redis锁
 */
public interface RedisLock {

    /**
     * 获取锁
     * @param tryMillSecondsTime 尝试时间 秒
     * @return
     */
    boolean tryLock(long tryMillSecondsTime);

    /**
     * 获取锁
     * @param tryTime 尝试时间
     * @param timeUnit 时间类型
     * @return
     */
    boolean tryLock(long tryTime, TimeUnit timeUnit);

    /**
     * 释放锁
     */
    void unLock();

    /**
     * 重制锁
     */
    void reInit();
}
