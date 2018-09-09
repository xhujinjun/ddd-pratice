package com.github.xiejj.settlement.application.exception;

/**
 * @author xiejinjun
 * @version 1.0 2018/9/9
 */
public class ApplicationException extends RuntimeException {
    public ApplicationException(String message, Throwable cause){
        super(message, cause);
    }
}
