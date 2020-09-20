package com.helixcry.inventory.service;

import com.helixcry.inventory.dtos.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDto getUser(String mobile);

}
