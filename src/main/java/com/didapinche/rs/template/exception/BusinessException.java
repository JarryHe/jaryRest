package com.didapinche.rs.template.exception;

/**
 * 业务异常
 */
public class BusinessException extends Exception {
    private static final long serialVersionUID = 1L;
    private int code;
    private String errorMessage;

    public BusinessException(int code, String errorMessage) {
        super(errorMessage);
        this.code = code;
        this.errorMessage = errorMessage;
    }

    public BusinessException(int code, String errorMessage, Throwable throwable) {
        super(errorMessage, throwable);
        this.code = code;
        this.errorMessage = errorMessage;
    }

    public int getCode() {
        return code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
