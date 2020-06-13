package com.thymleaf.services.Impl;

import com.thymleaf.models.Product;
import com.thymleaf.services.ServicesProduct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ServicesProductImpl implements ServicesProduct {
    static Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(1, new Product(1, "Oppo", "5000000.0"));
        productMap.put(2, new Product(2, "Samsung", "10000000.0"));
        productMap.put(3, new Product(3, "Apple", "20000000.0"));
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public String saveProduct(Product product) {
        productMap.put(product.getId(), product);
        return "Saved.";
    }

    @Override
    public String edit(int id, Product product) {
        productMap.replace(id, product);
        return "Edited";
    }

    @Override
    public String delete(int id) {
        productMap.remove(id);
        return "Deleted.";
    }

    @Override
    public Collection<Product> show() {
        return new ArrayList<>(productMap.values());
    }
}
