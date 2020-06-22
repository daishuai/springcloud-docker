package com.daishuai.controller;

import com.daishuai.base.entity.ResponseEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping
    public ResponseEntity<String> success() {

        ResponseEntity<String> success = ResponseEntity.success("200");
        try {
            log.info("health check: {}", objectMapper.writeValueAsString(success));
        } catch (JsonProcessingException e) {
            log.error("JSON 处理异常：{}", e.getMessage(), e);
        }
        return success;
    }
}
