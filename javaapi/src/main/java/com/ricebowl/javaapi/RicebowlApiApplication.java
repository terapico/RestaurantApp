package com.ricebowl.javaapi;

import com.ricebowl.javaapi.category.DishCategory;
import com.ricebowl.javaapi.category.DishCategoryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RicebowlApiApplication {
//	private final DishCategoryRepository dishCategoryRepository;
//	public RicebowlApiApplication(DishCategoryRepository dishCategoryRepository) throws Exception {
//		this.dishCategoryRepository = dishCategoryRepository;
//
//		List<DishCategory> dishCategories = this.dishCategoryRepository.findAll();
//		System.out.println(dishCategories);
//	}

	public static void main(String[] args) {
		SpringApplication.run(RicebowlApiApplication.class, args);
	}

}
