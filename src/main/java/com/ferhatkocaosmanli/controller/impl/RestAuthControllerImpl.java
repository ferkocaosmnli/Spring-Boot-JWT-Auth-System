package com.ferhatkocaosmanli.controller.impl;

import com.ferhatkocaosmanli.controller.IRestAuthController;
import com.ferhatkocaosmanli.dto.DtoUser;
import com.ferhatkocaosmanli.jwt.AuthRequest;
import com.ferhatkocaosmanli.jwt.AuthResponse;
import com.ferhatkocaosmanli.jwt.RefreshTokenRequest;
import com.ferhatkocaosmanli.service.IAuthService;
import com.ferhatkocaosmanli.service.IRefreshTokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAuthControllerImpl implements IRestAuthController{

    @Autowired
    private IAuthService authService;

    @Autowired
    private IRefreshTokenService refreshTokenService;

    @PostMapping("/register")
    @Override
    public DtoUser register(@Valid @RequestBody AuthRequest request) {
        return authService.register(request);
    }

    @PostMapping("/authenticate")
    @Override
    public AuthResponse authenticate(@Valid @RequestBody AuthRequest request) {
        return authService.authenticate(request);
    }

    @PostMapping("/refreshToken")
    @Override
    public AuthResponse refreshToken(@RequestBody RefreshTokenRequest request) {
        return refreshTokenService.refreshToken(request);
    }


}