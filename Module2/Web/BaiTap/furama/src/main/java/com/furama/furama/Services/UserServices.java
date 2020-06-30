package com.furama.furama.Services;

import com.furama.furama.Models.User;

import java.util.Optional;

public interface UserServices {
    void save(User user);
    Boolean checkUserLogin(User user);
}
