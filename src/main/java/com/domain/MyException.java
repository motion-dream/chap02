package com.domain;

public class MyException extends RuntimeException {
    private String message;
    public String getMessage(){
        return message;
    }
    public MyException(String message){
        this.message=message;
    }
}
