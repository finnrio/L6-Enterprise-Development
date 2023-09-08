package com.example.skill.infrastructure.category;

import com.example.skill.application.category.interfaces.ICategoryRepository;
import com.example.skill.domain.category.interfaces.ICategoryJpa;
import com.example.skill.infrastructure.category.interfaces.CrudCategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class CategoryRepository implements ICategoryRepository {
    private CrudCategoryRepository repository;

    public Iterable<ICategoryJpa> findAllCategories() { return repository.findAllCategories(); }

    public Optional<ICategoryJpa> findCategoryById(String id) { return repository.findCategoryById(id); }

    public ICategoryJpa save(ICategoryJpa category) { return repository.save(category); }
}
