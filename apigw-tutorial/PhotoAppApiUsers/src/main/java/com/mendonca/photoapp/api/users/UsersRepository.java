package com.mendonca.photoapp.api.users;

import org.springframework.data.repository.CrudRepository;

import com.mendonca.photoapp.api.users.data.UserEntity;

public interface UsersRepository extends CrudRepository<UserEntity, Long> {

	UserEntity findByEmail(String email);
	
	UserEntity findByUserId(String userId);
}
