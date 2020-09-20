package com.helixcry.inventory.controllers;

import com.helixcry.inventory.dtos.ProductDto;
import com.helixcry.inventory.dtos.UserDto;
import com.helixcry.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity fetchProductDetails(@PathVariable("id") String mobile){
        UserDto user = userService.getUser(mobile);
        return new ResponseEntity(user, HttpStatus.OK);
    }
}
