package com.senyint.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.senyint.pojo.User;

public interface UserRepository extends MongoRepository<User, Long> {
	User findByUsername(String username);
}
