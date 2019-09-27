package com.rc.blog.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndexResponse{

    @JsonProperty
    public Integer responseCode = ResponseCode.SUCCESS_RSP.getCode();

    @JsonProperty
    public String message = ResponseCode.SUCCESS_RSP.getMessage();

}
