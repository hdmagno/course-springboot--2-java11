package com.educandoweb.coursecap25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursecap25.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	

}
