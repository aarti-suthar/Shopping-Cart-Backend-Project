package com.Backend.ShoppingCart.DreamShop.request;

import com.Backend.ShoppingCart.DreamShop.model.Category;
import lombok.Data;

import java.math.BigDecimal;

@Data

public class ProductUpdateRequest {
    private Long id;
    private String name;
    private String brand;
    private String Description;
    private BigDecimal price;
    private int inventory;
    private Category category;
}
