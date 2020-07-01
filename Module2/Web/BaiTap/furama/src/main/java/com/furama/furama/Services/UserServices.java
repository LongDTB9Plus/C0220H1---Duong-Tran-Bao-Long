package com.furama.furama.Services;

import com.furama.furama.Models.User;
import org.springframework.validation.Validator;

import java.util.Optional;

public interface UserServices extends Validator {
    void save(User user);
    Boolean checkUserLogin(User user);
}
