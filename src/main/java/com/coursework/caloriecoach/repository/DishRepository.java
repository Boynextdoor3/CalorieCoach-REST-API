package com.coursework.caloriecoach.repository;

import com.coursework.caloriecoach.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}
