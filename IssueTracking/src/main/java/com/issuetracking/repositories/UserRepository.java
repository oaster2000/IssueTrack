package com.issuetracking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.issuetracking.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUsername(String username);
	
	
}
