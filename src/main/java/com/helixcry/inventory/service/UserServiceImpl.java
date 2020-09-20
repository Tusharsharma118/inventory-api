package com.helixcry.inventory.service;

import com.helixcry.inventory.dtos.UserDto;

public class UserServiceImpl implements UserService{
    @Override
    public UserDto getUser(String mobile) {
        return  UserDto.builder().mobileNumber("9810129921").userName("Herru").email("Herru@Herru.herru").build();
    }
}
