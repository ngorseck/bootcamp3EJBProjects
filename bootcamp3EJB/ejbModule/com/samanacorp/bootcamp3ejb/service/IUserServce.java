package com.samanacorp.bootcamp3ejb.service;

import java.util.Optional;

import com.samanacorp.bootcamp3ejb.dto.UserDto;

import jakarta.ejb.Local;

@Local
public interface IUserServce {

	public Optional<UserDto> login (String email, String password);
}
