package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.IArepositoriUser;

@Service
public class UserService {
	
	@Autowired
	private IArepositoriUser iaRepositoriUser;
	
	public User saveUser(User user) {
		iaRepositoriUser.save(user);
		return user;
	}
	public List<User> listUsers(){
		return iaRepositoriUser.findAll();
	}

}
