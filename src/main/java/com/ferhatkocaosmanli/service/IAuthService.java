package com.ferhatkocaosmanli.service;

import com.ferhatkocaosmanli.dto.DtoUser;
import com.ferhatkocaosmanli.jwt.AuthRequest;
import com.ferhatkocaosmanli.jwt.AuthResponse;

public interface IAuthService {

    public DtoUser register(AuthRequest request);

    public AuthResponse authenticate(AuthRequest request);
}
