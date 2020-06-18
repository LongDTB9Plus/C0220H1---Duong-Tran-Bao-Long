package com.validationbt.Models;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    @NotEmpty
    @Size(min = 5, max = 45)
    @Pattern(regexp = "[a-zA-Z]+$")
    private String firstName;
    @NotEmpty
    @Size(min = 5, max = 45)
    @Pattern(regexp = "[a-zA-Z]+$")
    private String lastName;
    @Min(value = 18)
    private Integer Age;
    @Email
    private String Email;

    public User() {

    }

    public User(@NotEmpty @Size(min = 5, max = 45) @Pattern(regexp = "[a-zA-Z]+$") String firstName, @NotEmpty @Size(min = 5, max = 45) @Pattern(regexp = "[a-zA-Z]+$") String lastName, @Min(value = 18) Integer age, @javax.validation.constraints.Email String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
        Email = email;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

}
