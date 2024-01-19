package com.waldstonsantana.webservicescomspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waldstonsantana.webservicescomspringboot.entities.User;

public interface UserRepository extends JpaRepository<User	, Long> {

	
}
