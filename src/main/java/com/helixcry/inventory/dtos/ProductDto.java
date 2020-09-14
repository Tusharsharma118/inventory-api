package com.helixcry.inventory.dtos;

import com.helixcry.inventory.models.constants.Category;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductDto {

    Long id;

    Category category;

    String name;

    String description;

    BigDecimal price;

    String videoUri;

    String imageString;

}
