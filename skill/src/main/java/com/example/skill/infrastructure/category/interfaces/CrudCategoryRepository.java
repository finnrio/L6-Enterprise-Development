package com.example.skill.infrastructure.category.interfaces;

import com.example.skill.domain.category.interfaces.ICategoryJpa;
import com.example.skill.infrastructure.category.CategoryJpa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CrudCategoryRepository extends CrudRepository<CategoryJpa, String> {
    @Query("FROM category c ORDER BY c.id ASC")
    Iterable<ICategoryJpa> findAllCategories();

    Optional<ICategoryJpa> findCategoryById(String id);

    ICategoryJpa save(ICategoryJpa category);
}
