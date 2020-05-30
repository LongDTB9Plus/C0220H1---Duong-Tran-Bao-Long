package Services;

import Models.Product;

import java.util.List;

public interface Services {
    List<Product> findAll();
    void save(Product product);
}
