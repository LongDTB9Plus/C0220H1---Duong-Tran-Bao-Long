package com.validationbt.Services.Impl;

import com.validationbt.Models.User;
import com.validationbt.Repository.UserRepository;
import com.validationbt.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
