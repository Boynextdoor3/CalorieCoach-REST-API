package com.coursework.caloriecoach.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.coursework.caloriecoach.entity.IngredientType}
 */
public record IngredientTypeDto(Long id, String name) implements Serializable {
}