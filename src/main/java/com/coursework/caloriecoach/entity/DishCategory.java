package com.coursework.caloriecoach.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "dish_categories")
public class DishCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Dish> dishes;
}