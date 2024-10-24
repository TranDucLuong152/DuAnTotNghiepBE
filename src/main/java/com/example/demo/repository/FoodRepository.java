package com.example.demo.repository;

import com.example.demo.entity.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity, Integer> {
    FoodEntity findByNameFood(String name);
}
