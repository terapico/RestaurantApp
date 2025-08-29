package com.ricebowl.javaapi.controller;

import com.ricebowl.javaapi.category.DishCategory;
import com.ricebowl.javaapi.category.DishCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dishcategory")
public class DishCategoryController {
    private final DishCategoryService dishCategoryService;

    public DishCategoryController(DishCategoryService dishCategoryService) {
        this.dishCategoryService = dishCategoryService;
    }

    @GetMapping("/")
    public Iterable<DishCategory> getAllDishCategories() {
        return dishCategoryService.getAllDishCategories();
    }
}
