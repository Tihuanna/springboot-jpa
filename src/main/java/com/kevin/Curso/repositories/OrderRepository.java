package com.kevin.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevin.Curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
