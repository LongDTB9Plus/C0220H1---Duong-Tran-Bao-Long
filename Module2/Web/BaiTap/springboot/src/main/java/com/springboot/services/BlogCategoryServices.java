package com.springboot.services;

import com.springboot.models.BlogCategory;

import java.util.List;

public interface BlogCategoryServices {
    List<BlogCategory> findAll();
}
