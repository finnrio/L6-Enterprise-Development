package com.example.skill.ui.skill;

import com.example.skill.application.skill.DTO.SkillDTO;
import com.example.skill.domain.skill.interfaces.ISkillJpa;

import java.util.Optional;

public interface ISkillQueryHandler {
    Iterable<ISkillJpa> findAllSkills();

    Optional<SkillDTO> findSkillById(String skill_id);
}
