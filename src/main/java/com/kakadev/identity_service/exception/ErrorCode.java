package com.kakadev.identity_service.exception;

public enum ErrorCode {
    INVALID_KEY(1000, "Invalid key provided"),
    USER_EXISTS(1001, "Username already exists"),
    USER_NOT_FOUND(1002, "User not found"),
    USERNAME_INVALID(1003, "Username must be between 3 and 50 characters"),
    PASSWORD_INVALID(1004, "Password must be between 8 and 20 characters"),
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
