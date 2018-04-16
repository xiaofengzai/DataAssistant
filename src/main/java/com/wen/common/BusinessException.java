package com.wen.common;

public class BusinessException extends RuntimeException{
    private Integer errorCode;
    public BusinessException(String message){
        super(message);
        this.errorCode=-1;
        AlertUtil.ErrorMessage(message);

    }

    public BusinessException(String message,Integer errorCode){
        this(message);
        this.errorCode=errorCode;
    }
}
