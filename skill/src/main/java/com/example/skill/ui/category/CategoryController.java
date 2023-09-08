package com.example.skill.ui.category;

import com.example.skill.application.identity.IdentityService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/categories")
@RestController
@AllArgsConstructor
public class CategoryController {
    private ICategoryQueryHandler queryHandler;
    private IdentityService identityService;

    @GetMapping("/findAll")
    public ResponseEntity<?> getAllCategoryDetails(
            @RequestHeader("Authorization") String token) {
        try {
            if (identityService.isAdmin(token)) {
                return ResponseEntity.ok().body(queryHandler.findAllCategories());
            }
        } catch (IllegalArgumentException iae) {
        }
        return generateErrorResponse("user not authorised");
    }

    @GetMapping("/{category_id}")
    public ResponseEntity<?> getCategoryById(
            @PathVariable(value="category_id") String category_id,
            @RequestHeader("Authorization") String token){
        if(identityService.isAdmin(token) || identityService.isSpecifiedUser(token, category_id)) {
            Optional<?> result = queryHandler.findCategoryById(category_id);
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
