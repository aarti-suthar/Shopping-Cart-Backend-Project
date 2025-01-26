package com.Backend.ShoppingCart.DreamShop.service.category;

import com.Backend.ShoppingCart.DreamShop.model.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {

    Category findCategoryById(Long Id);
    Category findCategoryByName(String name);
    List<Category> findAllCategories();
    Category addCategory(Category category);
    void deleteCategoryById(Long id);

    Category updateCategory(Category category, Long id);
}
