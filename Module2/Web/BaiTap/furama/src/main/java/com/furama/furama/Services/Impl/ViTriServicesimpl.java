package com.furama.furama.Services.Impl;

import com.furama.furama.Models.ViTri;
import com.furama.furama.Repository.ViTriRepository;
import com.furama.furama.Services.ViTriServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ViTriServicesimpl implements ViTriServices {
    @Autowired
    ViTriRepository viTriRepository;
    @Override
    public List<ViTri> findAll() {
        return viTriRepository.findAll();
    }
}
