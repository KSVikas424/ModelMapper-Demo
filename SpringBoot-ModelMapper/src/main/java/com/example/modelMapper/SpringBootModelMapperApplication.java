package com.example.modelMapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class SpringBootModelMapperApplication {

	public static void main(String[] args) {
		explicitModelMappingDemo();
	}

	private static void explicitModelMappingDemo() {
		User sourceUser = new User(1, "David", "david@testemail.com", "1234567889", "New York");

		UserDTO targetUserDTO = new UserDTO();

		ModelMapper modelMapper = new ModelMapper();

		modelMapper.addMappings(new PropertyMap<User, UserDTO>() {
			protected void configure() {
				map().setUserCity(source.getCity());
			}
		});

		modelMapper.map(sourceUser, targetUserDTO);

		System.out.println(targetUserDTO.getName());
		System.out.println(targetUserDTO.getEmailAddress());
		System.out.println(targetUserDTO.getMobileNumber());
		System.out.println(targetUserDTO.getUserCity());
	}
}