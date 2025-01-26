package com.Backend.ShoppingCart.DreamShop.request;

import com.Backend.ShoppingCart.DreamShop.model.Category;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private String Description;
    private BigDecimal price;
    private int inventory;
    private Category category;
}
