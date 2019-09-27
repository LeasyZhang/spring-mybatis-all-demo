package com.rc.blog.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ArticleResponse {

    public ArticleResponse(Integer responseCode, String message) {
        this.responseCode = responseCode;
        this.message = message;
    }

    @JsonProperty
    public Integer responseCode;

    @JsonProperty
    public String message;
}
