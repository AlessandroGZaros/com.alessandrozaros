package com.alessandrozaros.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrozaros.course.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
