package com.rc.blog.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseFactory {

    private ResponseFactory() {

    }

    public static ResponseEntity<IndexResponse> indexResponse() {
        return new ResponseEntity<>(new IndexResponse(), HttpStatus.OK);
    }

    public static ResponseEntity<ArticleResponse> articleUpdateSuccessResponse() {
        return new ResponseEntity<>(new ArticleResponse(ResponseCode.UPDATE_ARTICLE_SUCCESS_RSP.getCode(),
                ResponseCode.UPDATE_ARTICLE_SUCCESS_RSP.getMessage()), HttpStatus.OK);
    }
}
