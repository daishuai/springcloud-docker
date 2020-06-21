package com.daishuai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daishuai
 * @date 2020/6/18 23:05
 */
@Slf4j
@RestController
@RequestMapping(value = "/health")
public class HealthController {

    @GetMapping
    public String success() {
        log.info("health check >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        return "200";
    }
}
