package com.kevin.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevin.Curso.entities.OrderItem;
import com.kevin.Curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
