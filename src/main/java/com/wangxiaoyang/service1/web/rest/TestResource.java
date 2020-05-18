package com.wangxiaoyang.service1.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller for managing the current user's account.
 */
@RestController
@RequestMapping("/api")
public class TestResource {

    private final Logger log = LoggerFactory.getLogger(TestResource.class);

    /**
     * GET  /authenticate : check if the user is authenticated, and return its login.
     *
     * @param message 消息
     */
    @GetMapping("/test/{message}")
    public void test(@PathVariable String message) {
        log.debug("Test {}", message);
    }
}
