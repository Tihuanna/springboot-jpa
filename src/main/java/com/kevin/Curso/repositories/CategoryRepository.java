package com.kevin.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevin.Curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
