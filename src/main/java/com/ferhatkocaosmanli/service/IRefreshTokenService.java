package com.ferhatkocaosmanli.service;

import com.ferhatkocaosmanli.jwt.AuthResponse;
import com.ferhatkocaosmanli.jwt.RefreshTokenRequest;

public interface IRefreshTokenService {
    public AuthResponse refreshToken(RefreshTokenRequest request);

}
