package com.helixcry.inventory.dtos;

import com.helixcry.inventory.models.constants.Category;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class ProductDto {

    UUID id;

    Category category;

    String name;

    String description;

    BigDecimal price;

    String videoUri;

    String imageString;

}
