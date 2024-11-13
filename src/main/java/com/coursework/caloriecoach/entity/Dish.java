package com.coursework.caloriecoach.entity;

import jakarta.persistence.*;

import java.util.Map;

@Entity
@Table(name = "dishes")
public class Dish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "dish_category_id")
    private DishCategory category;

    @ElementCollection
    @CollectionTable(name = "dish_ingredient_quantities", joinColumns = @JoinColumn(name = "dish_id"))
    @MapKeyJoinColumn(name = "ingredient_id")
    @Column(name = "quantity")
    private Map<Ingredient, Integer> ingredients;
}