package com.waldstonsantana.webservicescomspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waldstonsantana.webservicescomspringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
