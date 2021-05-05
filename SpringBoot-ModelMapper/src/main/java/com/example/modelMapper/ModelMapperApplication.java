package com.example.modelMapper;

import org.modelmapper.ModelMapper;

public class ModelMapperApplication {

	public static void main(String[] args) {
		simpleModelMappingDemo();
	}

	private static void simpleModelMappingDemo() {
		User sourceUser = new User(1, "David", "david@testemail.com", "1234567889");

		UserDTO targetUserDTO = new UserDTO();

		ModelMapper modelMapper = new ModelMapper();

		modelMapper.map(sourceUser, targetUserDTO);

		System.out.println(targetUserDTO.getName());
		System.out.println(targetUserDTO.getEmailAddress());
		System.out.println(targetUserDTO.getMobileNumber());
		System.out.println(targetUserDTO.getUserCity());
	}
}