package com.beaute.spring.service;

import java.util.List;
import java.util.Optional;

import com.beaute.spring.entity.User;

public interface IUserService {

	List<User> getAll();
	Optional<User> findById(long id);
	long save(User User);
	void update(long id, User User);
	Optional<User> login(String name);
	void delete(long id);
}
