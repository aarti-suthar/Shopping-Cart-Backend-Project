package com.Backend.ShoppingCart.DreamShop.repositories;

import com.Backend.ShoppingCart.DreamShop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

    boolean existsByName(String name);
}
