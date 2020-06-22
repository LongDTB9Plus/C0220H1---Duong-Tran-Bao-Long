package com.banhang.services.Impl;

import com.banhang.models.Customer;
import com.banhang.repository.CustomerRepository;
import com.banhang.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServicesImpl implements CustomerServices {
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public String checkLoginAccount(Customer account) {
        List<Customer> customer = customerRepository.findCustomerByUsername(account.getUsername());
        if (customer.isEmpty()){
            return "Sai Ten Dang Nhap";
        }else if(customer.get(0).getPassWord().equals(account.getPassWord())){
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
}
