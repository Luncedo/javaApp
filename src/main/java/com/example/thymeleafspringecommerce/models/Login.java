package com.example.thymeleafspringecommerce.models;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Login {

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;
}
