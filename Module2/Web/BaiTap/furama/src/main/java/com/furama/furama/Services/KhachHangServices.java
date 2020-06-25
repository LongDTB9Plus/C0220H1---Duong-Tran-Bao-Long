package com.furama.furama.Services;

import com.furama.furama.Models.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public interface KhachHangServices {
    void save(KhachHang khachHang);

    Page<KhachHang> findAll(Pageable pageable);

    List<KhachHang> findAllStillActive();
}
