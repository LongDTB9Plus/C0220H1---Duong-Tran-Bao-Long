package com.furama.furama.Services.Impl;

import com.furama.furama.Models.Role;
import com.furama.furama.Repository.RoleRepository;
import com.furama.furama.Services.RoleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServicesImpl implements RoleServices {
    @Autowired
    RoleRepository roleRepository;
    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }
}
