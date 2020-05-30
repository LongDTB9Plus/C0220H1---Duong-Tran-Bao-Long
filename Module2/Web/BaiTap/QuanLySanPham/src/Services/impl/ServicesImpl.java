package Services.impl;

import Models.Product;
import Services.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicesImpl implements Services {


    public static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Samsung", 10000000));
        productMap.put(2, new Product(2, "Apple", 20000000));
        productMap.put(3, new Product(3, "XiaoMi", 5000000));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(), product);
    }
}
