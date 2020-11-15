package com.example.secure.rest.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtAuthenticationDto {
    private String accessToken;
    private String tokenType = "Bearer";

    public JwtAuthenticationDto(String accessToken) {
        this.accessToken = accessToken;
    }
}
