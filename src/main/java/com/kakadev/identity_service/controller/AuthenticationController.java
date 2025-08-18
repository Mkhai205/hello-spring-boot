package com.kakadev.identity_service.controller;

import com.kakadev.identity_service.dto.request.AuthenticationRequest;
import com.kakadev.identity_service.dto.response.ApiResponse;
import com.kakadev.identity_service.dto.response.AuthenticationResponse;
import com.kakadev.identity_service.exception.AppException;
import com.kakadev.identity_service.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationController {
    AuthenticationService authenticationService;

    @PostMapping("/login")
    ApiResponse<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) {
        boolean isAuthenticated = authenticationService.authenticate(request);
        return ApiResponse.<AuthenticationResponse>builder()
                .result(AuthenticationResponse.builder().
                        authenticated(isAuthenticated)
                        .build())
                .build();
    }
}
