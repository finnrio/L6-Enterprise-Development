package com.example.skill.application.category.interfaces;

import com.example.skill.domain.category.interfaces.ICategoryJpa;

import java.util.Optional;

public interface ICategoryRepository {
    Iterable<ICategoryJpa> findAllCategories();

    Optional<ICategoryJpa> findCategoryById(String id);

    ICategoryJpa save(ICategoryJpa category);
}
