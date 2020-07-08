package com.test2.services.impl;

import com.test2.entity.Sach;
import com.test2.repository.SachRepository;
import com.test2.services.SachServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Objects;

@Service
public class SachServicesImpl implements SachServices {
    @Autowired
    private SachRepository sachRepository;

    @Override
    public Page<Sach> findAll(Pageable pageable) {
        return sachRepository.findAll(pageable);
    }

    @Override
    public Sach findById(Integer id) {
        return sachRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        sachRepository.deleteById(id);
    }

    @Override
    public void save(Sach sach) {
        sachRepository.save(sach);
    }

    @Override
    public List<Sach> findByMaSach(Integer id) {
        return sachRepository.findAllByMaSach(id);
    }

    @Override
    public List<Sach> findByTenSach(String ten) {
        return sachRepository.findAllByTenSachContaining(ten);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Sach sach = (Sach) target;
        if (sach.getMaSach() == null){
            errors.rejectValue("maSach","Sach.maSach");
        }else {
        Integer id = sach.getMaSach();
        if (!((sachRepository.findById(id).orElse(null)) == null)) {
            errors.rejectValue("maSach", "Sach.maSach");
        }
        }
    }
}
