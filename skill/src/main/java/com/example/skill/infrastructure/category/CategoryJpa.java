package com.example.skill.infrastructure.category;

import com.example.skill.domain.category.interfaces.ICategoryJpa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity(name="category")
@Table(name="category")
@ToString
@Getter
@Setter
public class CategoryJpa implements ICategoryJpa {
    @Id
    @Column(name="id")
    private String id;

    @Column(name="category_name")
    private String category_name;

    protected CategoryJpa(){}

    protected CategoryJpa(String id, String category_name){
        this.id = id;
        this.category_name = category_name;
    }

    public static CategoryJpa categoryJpaOf(String id, String category_name) {
        return new CategoryJpa(id, category_name);
    }
}
