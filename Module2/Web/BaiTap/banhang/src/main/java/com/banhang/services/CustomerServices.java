package com.banhang.services;

import com.banhang.models.Customer;

import java.util.Optional;

public interface CustomerServices {
    String checkLoginAccount (Customer account);
    void save(Customer account);
    Boolean checkPermission (Customer customer);
    void addCart(Customer customer,Integer idProduct);
    void checkOut(Customer customer);
    Optional<Customer> findById(Integer id);
    Customer findByUsername(String username);
}
