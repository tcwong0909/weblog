package com.tcwong.redis.util;

import java.util.concurrent.TimeUnit;

public interface RedisLockFactory {
    RedisLock getLock(String key);

    RedisLock getLock(String key, int tryTime, TimeUnit timeUnit);
}
