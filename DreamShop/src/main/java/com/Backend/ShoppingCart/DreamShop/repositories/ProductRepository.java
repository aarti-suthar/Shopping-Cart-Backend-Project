package com.Backend.ShoppingCart.DreamShop.repositories;

import com.Backend.ShoppingCart.DreamShop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
