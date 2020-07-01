package com.furama.furama.Services.Impl;

import com.furama.furama.Models.User;
import com.furama.furama.Repository.UserRepository;
import com.furama.furama.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    UserRepository userRepository;
    @Autowired
    @Lazy
    private PasswordEncoder passwordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public Boolean checkUserLogin(User user) {
        Optional<User> userFound = userRepository.findUserByUsername(user.getUsername());
        return userFound.map(value -> value.getPassword().equals(user.getPassword())).orElse(false);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        if (user.getPassword().length() < 6){
            errors.rejectValue("password","errorMin");
        }
        if (user.getPassword().length() > 12){
            errors.rejectValue("password","errorMax");
        }
    }
}
