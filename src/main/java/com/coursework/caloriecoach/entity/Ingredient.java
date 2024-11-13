package com.coursework.caloriecoach.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double calories;
    private Double proteins;
    private Double fats;
    private Double carbohydrates;

    @ManyToOne
    @JoinColumn(name = "ingredient_type_id")
    private IngredientType type;
}
