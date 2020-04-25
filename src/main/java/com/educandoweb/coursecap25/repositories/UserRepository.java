package com.educandoweb.coursecap25.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursecap25.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	

}
