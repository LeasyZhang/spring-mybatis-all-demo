package com.rc.blog.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseFactory {

    private ResponseFactory() {

    }

    public static ResponseEntity<IndexResponse> indexResponse() {
        return new ResponseEntity<>(new IndexResponse(), HttpStatus.OK);
    }
}
