package com.ferhatkocaosmanli.controller;

import com.ferhatkocaosmanli.dto.DtoUser;
import com.ferhatkocaosmanli.jwt.AuthRequest;
import com.ferhatkocaosmanli.jwt.AuthResponse;
import com.ferhatkocaosmanli.jwt.RefreshTokenRequest;

public interface IRestAuthController {

    public DtoUser register(AuthRequest request);

    public AuthResponse authenticate(AuthRequest request);

    public AuthResponse refreshToken(RefreshTokenRequest request);
}
