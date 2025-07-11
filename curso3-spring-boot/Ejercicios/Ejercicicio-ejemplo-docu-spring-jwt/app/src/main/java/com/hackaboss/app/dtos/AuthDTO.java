package com.hackaboss.app.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AuthDTO {

    private String username;
    private String password;
}

