package com.helixcry.inventory.controllers;

import com.helixcry.inventory.dtos.ProductDto;
import com.helixcry.inventory.models.Product;
import com.helixcry.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/v1/product")
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> fetchProductDetails(@PathVariable("id") UUID id){
        ProductDto product = productService.getProduct(id);
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
}
