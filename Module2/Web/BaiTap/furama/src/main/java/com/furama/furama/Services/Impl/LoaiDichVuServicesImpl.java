package com.furama.furama.Services.Impl;

import com.furama.furama.Models.LoaiDichVu;
import com.furama.furama.Repository.LoaiDichVuRepository;
import com.furama.furama.Services.LoaiDichVuServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoaiDichVuServicesImpl implements LoaiDichVuServices {

    @Autowired
    LoaiDichVuRepository loaiDichVuRepository;

    @Override
    public List<LoaiDichVu> findAll() {
        return loaiDichVuRepository.findAll();
    }
}
