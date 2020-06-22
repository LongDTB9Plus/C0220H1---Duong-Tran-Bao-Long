package com.banhang.services;

import com.banhang.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductServices {
    void save(Product product);
    Page<Product> findAll(Pageable pageable);
}
