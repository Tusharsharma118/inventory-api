package com.helixcry.inventory.service;

import com.helixcry.inventory.dtos.ProductDto;
import com.helixcry.inventory.models.constants.Category;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductDto getProduct(UUID id) {
        return ProductDto.builder().id(UUID.fromString("051cd6a6-4975-46d8-95e7-ebc666d8c627")).category(Category.TOY).name("Toy").build();
    }
}
