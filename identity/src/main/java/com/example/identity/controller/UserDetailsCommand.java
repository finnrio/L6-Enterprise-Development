package com.example.identity.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDetailsCommand {
    private String username;
    private String password;
}

