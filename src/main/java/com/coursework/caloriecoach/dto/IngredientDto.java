package com.coursework.caloriecoach.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.coursework.caloriecoach.entity.Ingredient}
 */
public record IngredientDto(Long id, String name, Double calories, Double proteins, Double fats, Double carbohydrates,
                            IngredientTypeDto TypeName) implements Serializable {
}