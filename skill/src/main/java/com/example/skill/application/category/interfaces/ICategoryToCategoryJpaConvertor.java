package com.example.skill.application.category.interfaces;

import com.example.skill.domain.category.Category;
import com.example.skill.domain.category.interfaces.ICategoryJpa;

public interface ICategoryToCategoryJpaConvertor {
    ICategoryJpa convert(Category category);
}
