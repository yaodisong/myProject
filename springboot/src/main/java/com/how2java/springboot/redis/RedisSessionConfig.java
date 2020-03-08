package com.how2java.springboot.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@SpringBootConfiguration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 3600 * 24)
public class RedisSessionConfig {

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.timeout}")
    private int timeout;

    @Value("${spring.redis.pool.max-idle}")
    private int maxIdle;

    @Value("${spring.redis.pool.max-active}")
    private int maxTotal;

    @Value("${spring.redis.password}")
    private String pwd;

    @Bean
    public JedisPool redisPoolFactory() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxTotal(maxTotal);
        //取Jedis连接时进行校验，判断当前连接是否可用
        jedisPoolConfig.setTestOnBorrow(true);
        //返回Jedis连接时进行是否可用的校验
        jedisPoolConfig.setTestOnReturn(true);
        return new JedisPool(jedisPoolConfig, host, port, timeout, pwd);
    }

}
