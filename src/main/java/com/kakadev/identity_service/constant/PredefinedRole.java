package com.kakadev.identity_service.constant;

import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public enum PredefinedRole {
    ADMIN("ADMIN", "Administrator role"),
    STAFF("STAFF", "Staff role"),
    USER("USER", "User role")
    ;
    String name;
    String description;

    PredefinedRole(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
