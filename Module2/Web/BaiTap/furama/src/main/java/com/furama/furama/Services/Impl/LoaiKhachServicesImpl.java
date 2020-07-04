package com.furama.furama.Services.Impl;

import com.furama.furama.Models.LoaiKhach;
import com.furama.furama.Repository.LoaiKhachRepository;
import com.furama.furama.Services.LoaiKhachServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiKhachServicesImpl implements LoaiKhachServices {
    @Autowired
    LoaiKhachRepository loaiKhachRepository;
    @Override
    public List<LoaiKhach> findAll() {
        return loaiKhachRepository.findAll();
    }
}
