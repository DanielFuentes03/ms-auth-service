package com.responsys.auth.service;

import com.responsys.auth.dto.AuthResponse;
import com.responsys.auth.dto.LoginRequest;
import com.responsys.auth.dto.RegisterRequest;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}
