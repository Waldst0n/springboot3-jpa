package com.waldstonsantana.webservicescomspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waldstonsantana.webservicescomspringboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
