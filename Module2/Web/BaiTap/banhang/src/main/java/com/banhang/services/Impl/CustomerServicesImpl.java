package com.banhang.services.Impl;

import com.banhang.models.Customer;
import com.banhang.models.Product;
import com.banhang.repository.CustomerRepository;
import com.banhang.repository.ProductRepository;
import com.banhang.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServicesImpl implements CustomerServices {
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ProductRepository productRepository;
    @Override
    public String checkLoginAccount(Customer account) {
        List<Customer> customer = customerRepository.findCustomerByUsername(account.getUsername());
        if (customer.isEmpty()){
            return "Sai Ten Dang Nhap";
        }else if(customer.get(0).getPassword().equals(account.getPassword())){
            return "Welcome " + account.getUsername();
        }else return "Sai Mat Khau";
    }

    @Override
    public void save(Customer account) {
        customerRepository.save(account);
    }

    @Override
    public Boolean checkPermission(Customer customer) {
        if (customer.getUsername().equals("admin")) {
            return true;
        }else return false;
    }

    @Override
    public void addCart(Customer customer, Integer idProduct) {
        List<Product> cart = new ArrayList<>();
        if (customer.getProductList() != null) {
            cart = customer.getProductList();
        }
        cart.add(productRepository.findById(idProduct).get());
        customer.setProductList(cart);
    }

    @Override
    public void checkOut(Customer customer) {
        List<Product> checkOutCart = new ArrayList<>();
        customer.setProductList(checkOutCart);
        customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer findByUsername(String username) {

        return customerRepository.findCustomerByUsername(username).get(0);
    }
}
