package com.coursework.caloriecoach.repository;

import com.coursework.caloriecoach.entity.DishCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishCategoryRepository extends JpaRepository<DishCategory, Long> {
}
