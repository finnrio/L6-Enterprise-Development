package com.example.identity.application;

import com.example.identity.infrastructure.AppUserJpa;
import com.example.identity.infrastructure.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class UserService{
    private UserRepository userRepository;
    private JwtTokenUtil jwtTokenUtil;
    public Optional<String> authenticate(String username,
                                          String password){
        Optional<AppUserJpa> result = userRepository.findUserByUsernameAndPassword(username, password);

        if(result.isPresent()){
            return Optional.of(jwtTokenUtil.generateToken(result.get()));
        }
        return Optional.empty();
    }
}
