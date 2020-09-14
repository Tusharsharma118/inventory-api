package com.helixcry.inventory.controllers;

import com.helixcry.inventory.dtos.ProductDto;
import com.helixcry.inventory.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/api/product")
@RestController
public class ProductController {

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> fetchProductDetails(@RequestParam Long id){
        ProductDto product = ProductDto.builder().id((long) 101).name("NASCAR").build();
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
}
