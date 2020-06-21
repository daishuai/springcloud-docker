package com.daishuai.base.entity;

import lombok.Data;

/**
 * @author Daishuai
 * @date 2020/6/21 16:49
 */
@Data
public class ResponseEntity<T> {

    private String code;

    private String message;

    private Integer status;

    private T data;

    public ResponseEntity(String code, String message, Integer status, T data) {
        this.code = code;
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public static <T> ResponseEntity<T> success(T data) {
        return new ResponseEntity<>("0", "success", 200, data);
    }

    public static <T> ResponseEntity<T> success() {
        return success(null);
    }

    public static <T> ResponseEntity<T> error(String message) {
        return new ResponseEntity<>("1", message, 500, null);
    }
}
