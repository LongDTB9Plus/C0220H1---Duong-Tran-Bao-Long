package com.furama.furama.Services.Impl;

import com.furama.furama.Models.HopDong;
import com.furama.furama.Repository.HopDongRepository;
import com.furama.furama.Services.HopDongServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

@Service
public class HopDongServicesImpl implements HopDongServices {
    @Autowired
    HopDongRepository hopDongRepository;
    @Override
    public void save(HopDong hopDong) {
        hopDongRepository.save(hopDong);
    }

    @Override
    public Page<HopDong> findAll(Pageable pageable) {
        return hopDongRepository.findAll(pageable);
    }

    @Override
    public HopDong findById(Integer id) {
        return hopDongRepository.findById(id).orElse(null);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
