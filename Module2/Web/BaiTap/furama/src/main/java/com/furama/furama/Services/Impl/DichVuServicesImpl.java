package com.furama.furama.Services.Impl;

import com.furama.furama.Models.DichVu;
import com.furama.furama.Repository.DichVuRepository;
import com.furama.furama.Services.DichVuServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class DichVuServicesImpl implements DichVuServices {
    @Autowired
    DichVuRepository dichVuRepository;
    @Override
    public void save(DichVu dichVu) {
        dichVuRepository.save(dichVu);
    }

    @Override
    public Page<DichVu> findAll(Pageable pageable) {
        return dichVuRepository.findAll(pageable);
    }
}
