package com.rc.blog.controller;

import com.rc.blog.dto.response.IndexResponse;
import com.rc.blog.dto.response.ResponseFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping(value = "/")
    public ResponseEntity<IndexResponse> index() {
        return ResponseFactory.indexResponse();
    }
}
