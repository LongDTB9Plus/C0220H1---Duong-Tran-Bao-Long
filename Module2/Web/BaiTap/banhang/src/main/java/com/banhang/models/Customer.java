package com.banhang.models;

import net.bytebuddy.build.ToStringPlugin;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Ten Dang Nhap Khong Duoc De Trong")
    @Size(min = 5,max = 21)
    @Column(unique = true)
    private String username;
    @NotEmpty
    @Size(min = 5,max = 21)
    private String passWord;
    @ManyToMany(mappedBy = "customerList")
    @ToStringPlugin.Exclude
    List<Product> productList;

    public Customer() {
    }

    public Customer(String username, String passWord) {
        this.username = username;
        this.passWord = passWord;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
