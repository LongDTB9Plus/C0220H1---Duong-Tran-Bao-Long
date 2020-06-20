package com.springboot.repository;

import com.springboot.models.BlogCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;

public interface BlogCategoryRepository extends JpaRepository<BlogCategory,Integer> {
    Page<BlogCategory> findAllByBlogPostList(BlogCategory blogCategory);
}
