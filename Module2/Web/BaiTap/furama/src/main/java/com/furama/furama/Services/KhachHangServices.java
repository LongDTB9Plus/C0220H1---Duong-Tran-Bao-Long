package com.furama.furama.Services;

import com.furama.furama.Models.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

import java.util.List;

@Service
public interface KhachHangServices extends Validator {
    void save(KhachHang khachHang);

    Page<KhachHang> findAll(Pageable pageable);

    List<KhachHang> findAllStillActive();

    Boolean findKhachHangByCode(KhachHang khachHang);

    Page<KhachHang> searchAll(String keyword, Pageable pageable);
}
