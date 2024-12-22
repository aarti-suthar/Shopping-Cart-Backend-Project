package com.Backend.ShoppingCart.DreamShop.service.product;
import java.util.List;
import java.util.Optional;

import com.Backend.ShoppingCart.DreamShop.model.Product;

public interface IProductService{

    Product addProduct(Product product);
    Optional<Product> getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String Category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    List<Product> countProductsByBrandAndName(String brand, String name);
}
