package com.springboot.services.Impl;

import com.springboot.models.BlogCategory;
import com.springboot.repository.BlogCategoryRepository;
import com.springboot.services.BlogCategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogCategoryImpl implements BlogCategoryServices {
    @Autowired
    BlogCategoryRepository blogCategoryRepository;

    @Override
    public List<BlogCategory> findAll() {

        return blogCategoryRepository.findAll();
    }
}
