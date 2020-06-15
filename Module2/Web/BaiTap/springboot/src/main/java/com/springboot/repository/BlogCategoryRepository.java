package com.springboot.repository;

import com.springboot.models.BlogCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogCategoryRepository extends JpaRepository<BlogCategory,Integer> {
}
