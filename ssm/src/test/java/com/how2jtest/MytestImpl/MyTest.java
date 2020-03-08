package com.how2jtest.MytestImpl;

import com.how2jtest.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyTest extends BaseTest{

    @Before
    public void init() {
        System.out.println("before");
    }

    @Test
    public void doSomething(){

    }

    @After
    public void destory(){
        System.out.println("after");
    }
}
