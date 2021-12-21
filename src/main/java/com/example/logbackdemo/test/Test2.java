package com.example.logbackdemo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: pyt
 * @Date: 2021/12/20 15:23
 * @Description:
 */
public class Test2 {
    public static final Logger log = LoggerFactory.getLogger(Test2.class);

    public static void main(String[] args) {
        log.info("test2");
    }
}
