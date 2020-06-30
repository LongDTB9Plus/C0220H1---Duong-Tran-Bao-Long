package com.banhang.models;

import net.bytebuddy.build.ToStringPlugin;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Customer implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Ten Dang Nhap Khong Duoc De Trong")
    @Size(min = 5, max = 21)
    @Column(unique = true)
    private String username;
    @NotEmpty
    @Size(min = 5, max = 21)
    private String password;
    @ManyToMany(mappedBy = "customerList", cascade = CascadeType.ALL)
    List<Product> productList;

    public Customer() {
    }

    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Customer customer = (Customer) target;
        if (!customer.username.matches("^[a-zA-Z]")) {
            errors.rejectValue("username", "customer.name");
        }
        if (!customer.password.matches("^[A-Z]")){
            errors.rejectValue("password","customer.password");
        }
    }
}
