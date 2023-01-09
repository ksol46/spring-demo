package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(value = "/test")
	public UserDto test() {
		UserDto userDto = new UserDto();
		userDto.setAge(10);
		userDto.setName("이미나");
		
		System.out.println("객체정보:" + userDto.toString());		
		return userDto;
	}
}
