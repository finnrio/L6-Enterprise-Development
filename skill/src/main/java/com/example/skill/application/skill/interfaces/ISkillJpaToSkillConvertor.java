package com.example.skill.application.skill.interfaces;

import com.example.skill.domain.skill.Skill;
import com.example.skill.domain.skill.interfaces.ISkillJpa;

public interface ISkillJpaToSkillConvertor {
    Skill convert(ISkillJpa skillJpa);
}
