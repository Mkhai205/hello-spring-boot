package com.kakadev.identity_service.exception;

import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {
    USER_EXISTS(1001, "Username already exists"),
    USER_NOT_FOUND(1002, "User not found"),
    USERNAME_INVALID(1003, "Username must be between 3 and 50 characters"),
    PASSWORD_INVALID(1004, "Password must be between 8 and 20 characters"),
    UNAUTHENTICATED(1005, "User is not authenticated"),
    INVALID_KEY(8888, "Invalid key provided"),
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    ;
    int code;
    String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
