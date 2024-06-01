package com.samanacorp.bootcamp3ejb.service;

import java.util.Optional;

import com.samanacorp.bootcamp3ejb.dto.UserDto;

import jakarta.ejb.Stateless;

@Stateless
public class UserServiceImpl implements IUserServce {

	@Override
	public Optional<UserDto> login(String email, String password) {
		
		if (email.equals("seck@samanecorp.com") && password.equals("passer")) {
			
			return Optional.of(new UserDto(1, "seck@samanecorp.com", "passer")); 
		}
		return Optional.empty();
	}

}
