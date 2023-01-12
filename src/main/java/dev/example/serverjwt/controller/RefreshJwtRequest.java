package dev.example.serverjwt.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class RefreshJwtRequest {

    public String refreshToken;
}
