package com.banhang.services;

import com.banhang.models.Customer;

import java.util.List;

public interface CustomerServices {
    String checkLoginAccount (Customer account);
    void save(Customer account);
    Boolean checkPermission (Customer customer);
}
