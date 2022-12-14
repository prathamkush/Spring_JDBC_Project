package com.spring.boot.jdbc.SpringBootJDBC.ErrorResponse;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.ZonedDateTime;

public class PlayerErrorResponse {
    private int statusCode;
    private String path;
    private String msg;

    @JsonFormat(pattern = "YYYY-MM-DD HH:MM:SS")
    private ZonedDateTime timestamp;

    public PlayerErrorResponse(){}

    public PlayerErrorResponse(int statusCode, String path, String msg, ZonedDateTime timestamp) {
        this.statusCode = statusCode;
        this.path = path;
        this.msg = msg;
        this.timestamp = timestamp;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getPath() {
        return path;
    }

    public String getMsg() {
        return msg;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }


}
