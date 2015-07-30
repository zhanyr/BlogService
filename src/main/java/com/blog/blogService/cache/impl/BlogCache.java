package com.blog.blogService.cache.impl;

import com.blog.blogService.cache.IBlogCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.ShardedJedisPool;

import java.util.Map;
import java.util.Set;

/**
 * Created by zhanyr
 * datetime: 15/7/30 下午2:46
 * introduction
 */
@Service
public class BlogCache implements IBlogCache{

    @Autowired
    private ShardedJedisPool shardedJedisPool;

    public String set(String key, String value) {
        return null;
    }

    public String get(String key) {
        return null;
    }

    public String setMap(String key, String field, String value) {
        return null;
    }

    public String getMap(String key, String field) {
        return null;
    }

    public Long deleteKey(String key) {
        return null;
    }

    public boolean isHExists(String key, String field) {
        return false;
    }

    public Map<String, String> getHAll(String key) {
        return null;
    }

    public boolean setExpire(String key, int seconds) {
        return false;
    }

    public boolean isExists(String key) {
        return false;
    }

    public long zadd(String key, int score, String info) {
        return 0;
    }

    public Set zrange(String key) {
        return null;
    }

    public boolean setWithExpireTime(String key, String value, int seconds) {
        return false;
    }
}
