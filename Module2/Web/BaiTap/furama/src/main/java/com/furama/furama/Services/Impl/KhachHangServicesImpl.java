package com.furama.furama.Services.Impl;

import com.furama.furama.Models.KhachHang;
import com.furama.furama.Repository.KhachHangRepository;
import com.furama.furama.Services.KhachHangServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class KhachHangServicesImpl implements KhachHangServices{
    @Autowired
    KhachHangRepository khachHangRepository;

    @Override
    public void save(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public void remove(KhachHang khachHang) {
        khachHangRepository.delete(khachHang);
    }

    @Override
    public KhachHang findById(Integer id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    @Override
    public Page<KhachHang> findAll(Pageable pageable) {
        return khachHangRepository.findAll(pageable);
    }

    @Override
    public List<KhachHang> findAllStillActive() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return khachHangRepository.findAllStillActive(now);
    }

    @Override
    public Boolean findKhachHangByCode(KhachHang khachHang) {
        List<KhachHang> khachHangs = khachHangRepository.findKhachHangByCode(khachHang.getCode());
        if (khachHangs.isEmpty()){
            return true;
        }else return false ;
    }

    @Override
    public Page<KhachHang> searchAll(String keyword, Pageable pageable) {
        return khachHangRepository.findAllByAddressContainingOrBirthDayContainingOrNameContainingOrPhoneNumberContainingOrCmndContainingOrEmailContainingOrCodeContaining(keyword,keyword,keyword,keyword,keyword,keyword,keyword,pageable);
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        KhachHang khachHang = (KhachHang) target;
        if ((!this.findKhachHangByCode(khachHang))){
            errors.rejectValue("code","error");
        }
    }
}
