package com.kevin.Curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.kevin.Curso.entities.Order;
import com.kevin.Curso.entities.User;
import com.kevin.Curso.entities.enums.OrderStatus;
import com.kevin.Curso.repositories.OrderRepository;
import com.kevin.Curso.repositories.UserRepository;

@Configuration
@Profile("teste")
public class TesteConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2025-03-03T19:53:07Z"), u1, OrderStatus.PAID);
		Order o2 = new Order(null, Instant.parse("2025-03-03T03:42:10Z"),u2, OrderStatus.PAID);
		Order o3 = new Order(null, Instant.parse("2025-03-03T15:21:22Z"),u1, OrderStatus.SHIPPED); 
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
}
