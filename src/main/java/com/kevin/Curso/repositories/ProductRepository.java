package com.kevin.Curso.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevin.Curso.entities.Category;
import com.kevin.Curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
