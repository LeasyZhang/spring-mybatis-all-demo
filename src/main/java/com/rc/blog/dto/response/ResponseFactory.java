package com.rc.blog.dto.response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseFactory {

    private static final Logger logger = LoggerFactory.getLogger(ResponseFactory.class);

    public static ResponseEntity<IndexResponse> indexResponse() {
        return new ResponseEntity<>(new IndexResponse(), HttpStatus.OK);
    }
}
