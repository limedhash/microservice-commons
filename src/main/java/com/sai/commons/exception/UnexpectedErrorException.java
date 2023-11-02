package com.sai.commons.exception;

public class UnexpectedErrorException extends RuntimeException {
    public UnexpectedErrorException(Exception e){
        super(e);
    }

}
