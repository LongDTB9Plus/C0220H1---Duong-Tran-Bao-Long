package com.banhang.repository;

import com.banhang.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
   List <Customer> findCustomerByUsername (String username);

}
