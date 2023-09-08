package com.example.skill.application.skill.DTO;

import com.example.skill.domain.category.Category;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@ToString
public class SkillDTO {
    private String id;
    private String skill_name;
    private String desc;
    private Category category;
}
