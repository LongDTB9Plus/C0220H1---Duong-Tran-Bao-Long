package com.furama.furama.Services.Impl;

import com.furama.furama.Models.User;
import com.furama.furama.Repository.UserRepository;
import com.furama.furama.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public Boolean checkUserLogin(User user) {
        Optional<User> userFound = userRepository.findUserByUsername(user.getUsername());
        return userFound.map(value -> value.getPassword().equals(user.getPassword())).orElse(false);
    }
}
