package com.example.skill.infrastructure.skill;

import com.example.skill.domain.category.Category;
import com.example.skill.domain.skill.interfaces.ISkillJpa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="category")
@Table(name="category")
@ToString
@Getter
@Setter
public class SkillJpa implements ISkillJpa {
    @Id
    @Column(name="id")
    private String id;

    @Column(name="skill_name")
    private String skill_name;

    @Column(name="desc")
    private String desc;

    @Column(name="category")
    private Category category; // getting an error about the type here however I believe this is just an IDE issue

    protected SkillJpa(){}

    protected SkillJpa(String id, String skill_name, String desc, Category category) {
        this.id = id;
        this.skill_name = skill_name;
        this.desc = desc;
        this.category = category;
    }

    public static SkillJpa skillJpaOf(String id, String skill_name, String desc, Category category) {
        return new SkillJpa(id, skill_name, desc, category);
    }
}
