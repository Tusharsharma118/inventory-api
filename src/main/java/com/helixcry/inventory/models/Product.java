package com.helixcry.inventory.models;

import com.helixcry.inventory.models.constants.Category;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Entity
@Builder
public class Product {

    UUID id;

    Category category;

    String name;

    String description;

    BigDecimal price;

    String videoUri;

    String imageString;

}
