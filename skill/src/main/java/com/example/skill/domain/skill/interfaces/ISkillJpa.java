package com.example.skill.domain.skill.interfaces;

import com.example.skill.domain.category.Category;

public interface ISkillJpa {

    String getId();

    void setId(String id);

    String getSkill_name();

    void setSkill_name(String skill_name);

    String getDesc();

    void setDesc(String desc);

    Category getCategory();

    void setCategory(Category category);
}
