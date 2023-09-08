package com.example.skill.application.identity;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IdentityService {
    private JwtTokenUtil jwtTokenUtil;

    public boolean isSpecifiedUser(String token, String buyer_id){
        //check if token has expired...
        String buyerIdFound = jwtTokenUtil.getClaimFromToken(token, UserDTO.ID);
        return buyerIdFound.equals(buyer_id);
    }

    public boolean isAdmin(String token){
        //check if token has expired...
        String roleFound = jwtTokenUtil.getClaimFromToken(token, UserDTO.ROLE);
        return roleFound.equals("ADMIN");
    }

    public UserDTO getDetailsFromToken(String token){
        return new UserDTO(jwtTokenUtil.getClaimFromToken(token, UserDTO.ID),
                jwtTokenUtil.getClaimFromToken(token,UserDTO.USERNAME),
                jwtTokenUtil.getClaimFromToken(token,UserDTO.PASSWORD),
                jwtTokenUtil.getClaimFromToken(token, UserDTO.EMAIL),
                jwtTokenUtil.getClaimFromToken(token, UserDTO.FIRST_NAME),
                jwtTokenUtil.getClaimFromToken(token, UserDTO.SURNAME),
                jwtTokenUtil.getClaimFromToken(token, UserDTO.ROLE)
        );
    }
}

