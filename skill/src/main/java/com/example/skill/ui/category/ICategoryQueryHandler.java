package com.example.skill.ui.category;

import com.example.skill.application.category.DTO.CategoryDTO;
import com.example.skill.domain.category.interfaces.ICategoryJpa;
import java.util.Optional;

public interface ICategoryQueryHandler {
    Iterable<ICategoryJpa> findAllCategories();

    Optional<CategoryDTO> findCategoryById(String category_id);
}
