package com.kcnet.bowingapijava.api.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;

@RestController
public class UserController {

	@GetMapping("/user/{userId}")
	public UserDto getUser() {
		return UserDto.builder().userId("001")
			.name("John")
			.email("test@email.com")
			.build();
	}

	@GetMapping("/users")
	public List<UserDto> getAllUsers() {

		return Arrays.asList(
			UserDto.builder().userId("001")
				.name("John")
				.email("test@email.com")
				.build(),
			UserDto.builder().userId("002")
				.name("Mary")
				.email("test2@email.com")
				.build(),
			UserDto.builder().userId("003")
				.name("Tom")
				.email("test3@email.com")
				.build()
		);
	}

}
