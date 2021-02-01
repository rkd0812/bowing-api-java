package com.kcnet.bowingapijava.api.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDto {

	private String userId;
	private String password;
	private String name;
	private String email;

}
