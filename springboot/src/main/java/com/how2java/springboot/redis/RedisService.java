package com.how2java.springboot.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class RedisService {

    @Autowired
    private JedisPool jedisPool;

    //取值
    public String get(String key){
        if("".equals(key)){
            return null;
        }
        Jedis jedis = jedisPool.getResource();
        try {
            return jedis.get(key);
        } catch (Exception e) {
            return null;
        }finally {
            close(jedis);
        }
    }

    //存值
    public Boolean set(String key, String value){
        if("".equals(key) || "".equals(value)){
            return false;
        }
        Jedis jedis = jedisPool.getResource();
        try {
            String set = jedis.set(key, value);
            return "OK".equals(set);
        } catch (Exception e) {
            return false;
        }finally {
            close(jedis);
        }
    }

    //根据key删除
    public Boolean del(String key){
        if("".equals(key)){
            return false;
        }
        Jedis jedis = jedisPool.getResource();
        try {
            Long del = jedis.del(key);
            return 0 < del;
        } catch (Exception e) {
            return false;
        }finally {
            close(jedis);
        }
    }

    //回收连接
    public void close(Jedis jedis){
        jedis.close();
    }

}

