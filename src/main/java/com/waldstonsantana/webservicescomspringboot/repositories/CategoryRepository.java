package com.waldstonsantana.webservicescomspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waldstonsantana.webservicescomspringboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
