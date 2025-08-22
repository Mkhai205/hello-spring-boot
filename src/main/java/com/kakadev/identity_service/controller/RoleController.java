package com.kakadev.identity_service.controller;


import com.kakadev.identity_service.dto.request.RoleRequest;
import com.kakadev.identity_service.dto.response.ApiResponse;
import com.kakadev.identity_service.dto.response.RoleResponse;
import com.kakadev.identity_service.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class RoleController {
    RoleService roleService;

    @PostMapping
    ApiResponse<RoleResponse> createRole(@RequestBody RoleRequest request) {
        return ApiResponse.<RoleResponse>builder()
                .result(roleService.createRole(request))
                .build();
    }

    @GetMapping
    ApiResponse<List<RoleResponse>> getAllRoles() {
        return ApiResponse.<List<RoleResponse>>builder()
                .result(roleService.getAllRoles())
                .build();
    }

    @DeleteMapping("/{role}")
    ApiResponse<String> deleteRole(@PathVariable String role) {
        roleService.deleteRole(role);
        return ApiResponse.<String>builder()
                .message("Role " + role + " deleted successfully")
                .build();
    }
}
