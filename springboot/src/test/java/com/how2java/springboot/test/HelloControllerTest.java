package com.how2java.springboot.test;

import com.how2java.springboot.web.HelloController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloControllerTest {

    @Autowired
    private HelloController helloController;

    @Test
    public void getHello() throws Exception {
        final String greeting = helloController.redisTest();
        Assert.assertEquals("123", greeting);
    }
}
