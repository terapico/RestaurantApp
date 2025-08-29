package com.ricebowl.javaapi.category;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DishCategoryService {
    private final DishCategoryRepository dishCategoryRepository;

    public DishCategoryService(DishCategoryRepository dishCategoryRepository) {
        this.dishCategoryRepository = dishCategoryRepository;
    }

    public List<DishCategory> getAllDishCategories() {
        List<DishCategory> all = dishCategoryRepository.findAll();

        return all;
    }
}
