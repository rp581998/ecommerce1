package com.ecommerce.rajan.repository;

import com.ecommerce.rajan.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
