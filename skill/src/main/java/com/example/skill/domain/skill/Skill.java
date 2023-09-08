package com.example.skill.domain.skill;

import com.example.skill.domain.category.Category;
import com.example.skill.domain.common.Entity;
import com.example.skill.domain.common.Identity;
import lombok.ToString;

@ToString
public class Skill extends Entity {
    private String skillName;
    private String desc;
    private Category category;

    public Skill(Identity id, String skillName, String desc, Category category) {
        super(id);
        this.skillName = skillName;
        this.desc = desc;
        this.category = category;
    }

    public static Skill skillOf(Identity id, String skillName, String desc, Category category) {
        return new Skill(id, skillName, desc, category);
    }

    public void updateSkillName(String skillName) { this.skillName = skillName; }

    public void updateDesc(String desc) { this.desc = desc; }

    public void updateCategory(Category category) { this.category = category; }

    public Identity id() { return id; }

    public String skillName() { return skillName; }

    public String desc() { return desc; }

    public Category category() { return category; }
}
