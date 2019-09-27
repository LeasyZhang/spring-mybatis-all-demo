package com.rc.blog.dto.response;

public enum ResponseCode {

    SUCCESS_RSP(200, "You are using Spring Blog system!"),
    UPDATE_ARTICLE_SUCCESS_RSP(200, "The article update successfully!"),
    ARTICLE_NOT_FOUND(404, "The article does not exist!!");

    private Integer code;

    private String message;

    ResponseCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ResponseCode{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
