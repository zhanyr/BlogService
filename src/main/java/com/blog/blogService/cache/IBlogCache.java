package com.blog.blogService.cache;

import java.util.Map;
import java.util.Set;

/**
 * Created by zhanyr
 * datetime: 15/7/30 下午2:37
 * introduction
 */
public interface IBlogCache {
    public String set(String key,String value);
    public String get(String key);
    public String setMap(String key,String field,String value);
    public String getMap(String key,String field);
    public Long deleteKey(String key);
    public boolean isHExists(String key,String field);
    public Map<String,String> getHAll(String key);
    public boolean setExpire(String key,int seconds);
    public boolean isExists(String key);
    public long zadd(String key,int score,String info);
    public Set zrange(String key);
    public boolean setWithExpireTime(String key,String value,int seconds);
}
