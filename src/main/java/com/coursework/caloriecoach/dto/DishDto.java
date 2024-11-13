package com.coursework.caloriecoach.dto;

import com.coursework.caloriecoach.entity.Ingredient;

import java.io.Serializable;
import java.util.Map;

/**
 * DTO for {@link com.coursework.caloriecoach.entity.Dish}
 */
public record DishDto(Long id, String name, DishCategoryDto categoryName,
                      Map<Ingredient, Integer> ingredients) implements Serializable {
}