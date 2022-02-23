package com.beaute.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.beaute.spring.entity.User;
import com.beaute.spring.repository.UserRepository;


@Service
@Transactional
public class UserService implements IUserService {
@Autowired
UserRepository userRepository;

public List<User> getAll(){
System.out.println("Get all Users 111111...");
return userRepository.findAll(Sort.by("username").ascending());

}
public Optional<User> findById(long id) {
	return userRepository.findById(id);
	
}
public long save(User User) {
	System.out.println("save all Users 1111...");
	User user = new User();
	user.setUsername(User.getUsername());
	user.setEmail(User.getEmail());
	user.setPassword(User.getPassword());
	user.setFirstName(User.getFirstName());;
	user.setLastName(User.getLastName());
	user.setRole(User.getRole());
	user.setActive(User.isActive());
	return userRepository.save(user).getId();
}

public void update(long id, User User) {
	Optional<User> userr = userRepository.findById(id);
	if (userr.isPresent()) {
		User user = userr.get();
		user.setUsername(User.getUsername());
		user.setEmail(User.getEmail());
		user.setPassword(User.getPassword());
		user.setFirstName(User.getFirstName());;
		user.setLastName(User.getLastName());
		user.setRole(User.getRole());
		user.setActive(User.isActive());
	}
}



public Optional<User> login(String name){
	return userRepository.findByUsername(name);
}
public void delete(long id) {
	Optional<User> user = userRepository.findById(id);
	user.ifPresent(userRepository::delete);
}

}

	
	

