package com.example.skill.ui.skill;

import com.example.skill.application.identity.IdentityService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/skills")
@RestController
@AllArgsConstructor
public class SkillController {
    private ISkillQueryHandler queryHandler;
    private IdentityService identityService;

    @GetMapping("/findAll")
    public ResponseEntity<?> getAllSkillDetails(
            @RequestHeader("Authorization") String token) {
        try {
            if(identityService.isAdmin(token)) {
                return ResponseEntity.ok().body(queryHandler.findAllSkills());
            }
        } catch (IllegalArgumentException iae) {}
        return generateErrorResponse("user not authorised");
    }

    @GetMapping("/{skill_id}")
    public ResponseEntity<?> getSkillById(
            @PathVariable(value="skill_id") String skill_id,
            @RequestHeader("Authorization") String token){
        if(identityService.isAdmin(token) || identityService.isSpecifiedUser(token, skill_id)) {
            Optional<?> result = queryHandler.findSkillById(skill_id);
            if (result.isPresent()) {
                return ResponseEntity.ok().body(result);
            } else {
                return generateErrorResponse("id not found");
            }
        }
        return generateErrorResponse("user not authorised");
    }

    private ResponseEntity generateErrorResponse(String message){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}
