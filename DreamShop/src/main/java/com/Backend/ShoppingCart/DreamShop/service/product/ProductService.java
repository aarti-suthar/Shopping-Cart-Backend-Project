package com.Backend.ShoppingCart.DreamShop.service.product;

import com.Backend.ShoppingCart.DreamShop.exceptions.ProductNotFoundException;
import com.Backend.ShoppingCart.DreamShop.model.Product;
import com.Backend.ShoppingCart.DreamShop.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

public class ProductService implements IProductService{

    ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return Optional.ofNullable(productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("ProductNotFound!")));
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public void updateProduct(Product product, Long productId) {
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategory(String Category) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrand(String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByCategoryAndBrand(String category, String brand) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return List.of();
    }

    @Override
    public List<Product> getProductsByBrandAndName(String brand, String name) {
        return List.of();
    }

    @Override
    public List<Product> countProductsByBrandAndName(String brand, String name) {
        return List.of();
    }
}
