package com.Backend.ShoppingCart.DreamShop.repositories;

import com.Backend.ShoppingCart.DreamShop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findProductByCategoryName(String category);

    List<Product> findProductByBrand(String brand);

    List<Product> findProductByCategoryNameAndBrand(String category, String brand);

    List<Product> findProductByName(String name);

    List<Product> findProductByBrandAndName(String brand, String name);

    List<Product> countByBrandAndName(String brand, String name);
}
