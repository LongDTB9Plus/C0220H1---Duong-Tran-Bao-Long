package com.furama.furama.Services.Impl;

import com.furama.furama.Models.DichVu;
import com.furama.furama.Repository.DichVuRepository;
import com.furama.furama.Services.DichVuServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<DichVu> findDichVuByCode(String code) {
        return dichVuRepository.findDichVuByCode(code);
    }

    @Override
    public List<DichVu> findAll() {
        return dichVuRepository.findAll();
    }

    @Override
    public void remove(DichVu dichVu) {
        dichVuRepository.delete(dichVu);
    }

    @Override
    public DichVu findById(Integer id) {
        return dichVuRepository.findById(id).orElse(null);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        DichVu dichVu = (DichVu) target;
        List<DichVu> optionalDichVus = findDichVuByCode(dichVu.getCode());
        if (!optionalDichVus.isEmpty()){
            errors.rejectValue("codeDV","codeDV");
        }
        if(!dichVu.getCode().matches("DV-[0-9]{4}")){
            errors.rejectValue("codeDVpattern","codeDVpattern");
        }

    }
}
