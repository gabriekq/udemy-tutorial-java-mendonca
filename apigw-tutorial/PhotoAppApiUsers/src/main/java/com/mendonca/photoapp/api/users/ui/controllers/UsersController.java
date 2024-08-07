package com.mendonca.photoapp.api.users.ui.controllers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.mendonca.photoapp.api.users.service.UsersService;
import com.mendonca.photoapp.api.users.shared.UserDto;
import com.mendonca.photoapp.api.users.ui.model.CreateUserRequestModel;
import com.mendonca.photoapp.api.users.ui.model.CreateUserResponseModel;
import com.mendonca.photoapp.api.users.ui.model.UserResponseModel;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private Environment environment;
	
	
	@Autowired
	UsersService usersService;
	
	@GetMapping("/status/check")
	public String status() {
		return "working"+environment.getProperty("local.server.port")+" secret "+environment.getProperty("token.secret");
	}
	
	//@PostMapping
	@PostMapping(
			consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
			produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }
			)
	public ResponseEntity<CreateUserResponseModel> createUser(@Valid @RequestBody CreateUserRequestModel userDetails) {
		
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		
		UserDto userDto = modelMapper.map(userDetails,UserDto.class);
		 UserDto createdUser = usersService.createUser(userDto);
		
		CreateUserResponseModel returnUser = modelMapper.map(createdUser, CreateUserResponseModel.class);
		return  ResponseEntity.status(HttpStatus.CREATED).body(returnUser);
	}
	
	
    @GetMapping(value="/{userId}", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<UserResponseModel> getUser(@PathVariable("userId") String userId){
		
    	   UserDto userDto = usersService.getUserByUserId(userId); 
           UserResponseModel returnValue = new ModelMapper().map(userDto, UserResponseModel.class);
           
           return ResponseEntity.status(HttpStatus.OK).body(returnValue);
    	
    	
	}
	
	
	
}
