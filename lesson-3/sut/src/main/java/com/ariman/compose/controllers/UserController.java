package com.ariman.compose.controllers;

import com.ariman.compose.representation.request.CreateUserRequestRepresentation;
import com.ariman.compose.representation.response.CreateUserResponseRepresentation;
import com.ariman.compose.representation.response.GetUserResponseRepresentation;
import com.ariman.compose.representation.response.GetUsersResponseRepresentation;
import com.ariman.compose.service.UserService;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ariman.compose.entity.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	private final Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping
	public GetUsersResponseRepresentation getUsers() {
		logger.info("returning list of all users");

		GetUserResponseRepresentation userResponseRepresentation;
		GetUsersResponseRepresentation responseRepresentation = new GetUsersResponseRepresentation();
		List<User> users = userService.getUsers();

		for (User user: users) {
			 userResponseRepresentation = new GetUserResponseRepresentation();
			userResponseRepresentation.userToRepresentation(user);
			responseRepresentation.insertUser(userResponseRepresentation);
		}

		return responseRepresentation;
	}

	@Cacheable(value = "users", key = "#uid")
	@GetMapping("/{uid}")
	public GetUserResponseRepresentation getUser(@PathVariable String uid) {
		logger.info("returning user for uid " + uid);

		User user = userService.getUser(uid);
		GetUserResponseRepresentation responseRepresentation;

		if (user != null) {
			 responseRepresentation = new GetUserResponseRepresentation();
			 responseRepresentation.setUserId(user.getUid());
			 responseRepresentation.setName(user.getName());
			 responseRepresentation.setCity(user.getCity());
			 responseRepresentation.setEmail(user.getEmail());
		} else {
			responseRepresentation = null;
		}

		return responseRepresentation;
	}

	@PostMapping
	public CreateUserResponseRepresentation save(@RequestBody CreateUserRequestRepresentation newUser) {
		logger.info("saving user details: " + newUser.toString());
		String userId = userService.createUser(newUser);

		CreateUserResponseRepresentation responseRepresentation = new CreateUserResponseRepresentation();
		responseRepresentation.setUserId(userId);

		return responseRepresentation;
	}
}
