package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.AreaEntity;
import com.example.demo.entity.CategoryFoodEntity;

@Repository
public interface AreaRepository extends JpaRepository<AreaEntity, Integer> {

    AreaEntity findByNameArea(String nameArea);
}
