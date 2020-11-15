package com.example.secure.rest.controller;

import com.example.secure.rest.dto.JwtAuthenticationDto;
import com.example.secure.rest.dto.LoginDto;
import com.example.secure.rest.dto.SignUpDto;
import com.example.secure.rest.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(AuthController.BASE_URL)
@Slf4j
public class AuthController {
    public static final String BASE_URL = "/api/v1/auth";

    private AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signin")
    @ResponseStatus(HttpStatus.OK)
    public JwtAuthenticationDto login(@RequestBody LoginDto loginRequest) {
        return authService.authenticateUser(loginRequest);
    }

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.OK)
    public Long register(@RequestBody SignUpDto signUpRequest) throws Exception{
        return authService.registerUser(signUpRequest);
    }
}
