package Services;

import Models.Product;

import java.util.ArrayList;
import java.util.List;

public interface Services {
    ArrayList<Product> findAll();
    void save(Product product);
    Product findByID(int id);
    void update(int id, Product product);
    void remove(int id);
}
