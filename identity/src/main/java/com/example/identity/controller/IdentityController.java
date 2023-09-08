package com.example.identity.controller;

import com.example.identity.application.UserService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@AllArgsConstructor
@RestController
public class IdentityController {
    private UserService userService;

    @PostMapping("/validate")
    public ResponseEntity<?> validate
            (@RequestBody UserDetailsCommand command){
        Optional<String> token = userService.authenticate(command.getUsername(), command.getPassword());
        if(token.isPresent()){
            return ResponseEntity.ok(token);
        }
        return ResponseEntity.badRequest().body("Invalid details provided");
    }
}

