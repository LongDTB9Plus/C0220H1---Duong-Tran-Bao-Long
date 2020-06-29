package com.springboot.repository;

import com.springboot.models.BlogCategory;
import com.springboot.models.BlogPost;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Locale;

public interface BlogCategoryRepository extends JpaRepository<BlogCategory,Integer> {

}
