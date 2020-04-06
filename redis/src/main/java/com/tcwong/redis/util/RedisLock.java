package com.tcwong.redis.util;

import java.util.concurrent.TimeUnit;

public interface RedisLock {
    boolean tryLock(long tryMillSecondsTime);

    boolean tryLock(long tryTime, TimeUnit timeUnit);

    void unLock();

    void reInit();
}
