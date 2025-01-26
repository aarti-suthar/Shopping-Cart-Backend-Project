package com.Backend.ShoppingCart.DreamShop.service.category;

import com.Backend.ShoppingCart.DreamShop.exceptions.AlreadyExistsException;
import com.Backend.ShoppingCart.DreamShop.exceptions.CategoryNotFoundException;
import com.Backend.ShoppingCart.DreamShop.model.Category;
import com.Backend.ShoppingCart.DreamShop.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService{

    public final CategoryRepository categoryRepository;

    @Override
    public Category findCategoryById(Long Id){
        return  categoryRepository.findById(Id)
                .orElseThrow(() -> new CategoryNotFoundException("Category Not Found!"));
    }

    @Override
    public Category findCategoryByName(String name){
        return  categoryRepository.findByName(name);
    }

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public void deleteCategoryById(Long id) {
        //find the category by id
        categoryRepository.findById(id).ifPresentOrElse(categoryRepository :: delete,
                () -> { throw new CategoryNotFoundException("Category Not Found!");});
    }

    @Override
    public Category addCategory(Category category) {
        return Optional.of(category).filter(c -> !categoryRepository.existsByName(c.getName()))
                .map(categoryRepository :: save)
                .orElseThrow(() -> { throw new AlreadyExistsException(category.getName()+"Already Exists");}
        );
    }

    @Override
    public Category updateCategory(Category category, Long id) {

        return Optional.ofNullable(findCategoryById(id)).map(
                oldCategory -> { oldCategory.setName(category.getName());
                return categoryRepository.save(oldCategory);
                }).orElseThrow(() -> {throw new CategoryNotFoundException("Category Not Found!");});
    }
}
