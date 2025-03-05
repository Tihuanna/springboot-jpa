package com.kevin.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevin.Curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
