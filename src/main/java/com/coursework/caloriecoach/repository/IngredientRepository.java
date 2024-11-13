package com.coursework.caloriecoach.repository;

import com.coursework.caloriecoach.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
