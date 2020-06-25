package com.furama.furama.Services.Impl;

import com.furama.furama.Models.KhachHang;
import com.furama.furama.Repository.KhachHangRepository;
import com.furama.furama.Services.KhachHangServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class KhachHangServicesImpl implements KhachHangServices {
    @Autowired
    KhachHangRepository khachHangRepository;
    @Override
    public void save(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
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
}
