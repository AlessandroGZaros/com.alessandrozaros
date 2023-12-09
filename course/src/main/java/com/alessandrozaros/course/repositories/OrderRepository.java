package com.alessandrozaros.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alessandrozaros.course.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
