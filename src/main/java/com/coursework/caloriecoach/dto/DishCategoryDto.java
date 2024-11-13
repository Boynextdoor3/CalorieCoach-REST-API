package com.coursework.caloriecoach.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.coursework.caloriecoach.entity.DishCategory}
 */
public record DishCategoryDto(Long id, String name) implements Serializable {
}