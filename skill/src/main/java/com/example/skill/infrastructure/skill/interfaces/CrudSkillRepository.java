package com.example.skill.infrastructure.skill.interfaces;

import com.example.skill.domain.skill.interfaces.ISkillJpa;
import com.example.skill.infrastructure.skill.SkillJpa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudSkillRepository extends CrudRepository<SkillJpa, String> {
}
