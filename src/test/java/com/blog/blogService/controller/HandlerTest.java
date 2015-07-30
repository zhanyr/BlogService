package com.blog.blogService.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Created by zhanyr
 * datetime: 15/7/30 下午4:31
 * introduction
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/ApplicationContext.xml")
public class HandlerTest {

    @Autowired
    private Handler handler;

    @Test
    public void testIsRightUser(){
        handler.isRightUser("zhanyr","111");
    }
}
