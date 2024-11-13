package com.coursework.caloriecoach.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "ingredient_types")
public class IngredientType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "type")
    private List<Ingredient> ingredients;
}