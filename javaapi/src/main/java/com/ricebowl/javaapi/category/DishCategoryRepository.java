package com.ricebowl.javaapi.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishCategoryRepository extends JpaRepository<DishCategory, String> {
}
