package com.example.skill.application.skill.interfaces;

import com.example.skill.domain.skill.interfaces.ISkillJpa;

import java.util.Optional;

public interface ISkillRepository {
    Iterable<ISkillJpa> findAllSkills();

    Optional<ISkillJpa> findSkillById(String id);

    ISkillJpa save(ISkillJpa skill);
}
