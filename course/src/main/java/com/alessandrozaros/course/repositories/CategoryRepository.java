package com.alessandrozaros.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrozaros.course.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
