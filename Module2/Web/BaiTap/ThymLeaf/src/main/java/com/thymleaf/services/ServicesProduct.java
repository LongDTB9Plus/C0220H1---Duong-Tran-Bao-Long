package com.thymleaf.services;

import com.thymleaf.models.Product;

import java.util.Collection;

public interface ServicesProduct {
    Product findById(int id);
    String saveProduct(Product product);
    String edit(int id,Product product);
    String delete(int id);
    Collection<Product> show();
}
