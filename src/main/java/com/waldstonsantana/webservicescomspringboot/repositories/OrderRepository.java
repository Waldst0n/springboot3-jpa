package com.waldstonsantana.webservicescomspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waldstonsantana.webservicescomspringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order , Long> {

	
}
