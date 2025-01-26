package com.Backend.ShoppingCart.DreamShop.service.product;
import java.util.List;
import java.util.Optional;

import com.Backend.ShoppingCart.DreamShop.model.Category;
import com.Backend.ShoppingCart.DreamShop.model.Product;
import com.Backend.ShoppingCart.DreamShop.request.AddProductRequest;
import com.Backend.ShoppingCart.DreamShop.request.ProductUpdateRequest;

public interface IProductService{

    Product addProduct(AddProductRequest request);
    Product createProduct(AddProductRequest request, Category category);
    Product updateProduct(ProductUpdateRequest request, Long productId);
    Optional<Product> getProductById(Long id);
    void deleteProductById(Long id);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String Category);
    List<Product> getProductsByBrand(String brand);
    List<Product> getProductsByCategoryAndBrand(String category, String brand);
    List<Product> getProductsByName(String name);
    List<Product> getProductsByBrandAndName(String brand, String name);
    List<Product> countProductsByBrandAndName(String brand, String name);
}
