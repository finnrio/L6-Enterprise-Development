package com.example.skill.application.category.interfaces;

import com.example.skill.domain.category.Category;
import com.example.skill.domain.category.interfaces.ICategoryJpa;

public interface ICategoryJpaToCategoryConvertor {
    Category convert(ICategoryJpa categoryJpa);
}
