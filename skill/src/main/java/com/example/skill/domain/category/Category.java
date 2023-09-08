package com.example.skill.domain.category;

import com.example.skill.domain.common.Entity;
import com.example.skill.domain.common.Identity;
import com.example.skill.infrastructure.category.CategoryJpa;
import lombok.ToString;

@ToString
public class Category extends Entity {
    private String categoryName;

    public Category(Identity id, String categoryName) {
        super(id);
        this.categoryName = categoryName;
    }

    public static Category categoryOf(Identity id, String categoryName) { return new Category(id, categoryName); }

    public void updateCategoryName(String categoryName) { this.categoryName = categoryName; }

    public Identity id() { return id; }

    public String categoryName() { return categoryName; }
}
