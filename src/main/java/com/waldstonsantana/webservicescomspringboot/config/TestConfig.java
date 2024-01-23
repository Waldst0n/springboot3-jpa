package com.waldstonsantana.webservicescomspringboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.waldstonsantana.webservicescomspringboot.entities.Category;
import com.waldstonsantana.webservicescomspringboot.entities.Order;
import com.waldstonsantana.webservicescomspringboot.entities.User;
import com.waldstonsantana.webservicescomspringboot.entities.enums.OrderStatus;
import com.waldstonsantana.webservicescomspringboot.repositories.CategoryRepository;
import com.waldstonsantana.webservicescomspringboot.repositories.OrderRepository;
import com.waldstonsantana.webservicescomspringboot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository order;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category c1 = new Category(null, "Eletronics");
		Category c2 = new Category(null, "Books");
		Category c3 = new Category(null, "Computers");
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.CANCELED , u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T19:00:07Z"),OrderStatus.CANCELED , u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:33:04Z"),OrderStatus.CANCELED , u1);
		
		
		
		

		userRepository.saveAll(Arrays.asList(u1,u2));
		order.saveAll(Arrays.asList(o1,o2,o3));
		categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
		
	}
	
	
}
