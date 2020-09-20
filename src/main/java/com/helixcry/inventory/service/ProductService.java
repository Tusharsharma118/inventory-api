package com.helixcry.inventory.service;

import com.helixcry.inventory.dtos.ProductDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface ProductService {

    ProductDto getProduct(UUID id);


}
