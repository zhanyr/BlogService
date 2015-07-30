package com.blog.blogService.controller;

import com.blog.finagle.thrift.blogService.BlogService;
import com.blog.finagle.thrift.result.BooleanResult;
import com.twitter.util.Future;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by zhanyr
 * datetime: 15/7/28 下午8:58
 * introduction
 */
@Service
public class Handler implements BlogService.ServiceIface{

    private Logger logger = LoggerFactory.getLogger(Handler.class);

    @Override
    public Future<BooleanResult> isRightUser(String username, String password) {
        logger.info("Invoke method isRightUser");
        return null;
    }
}
