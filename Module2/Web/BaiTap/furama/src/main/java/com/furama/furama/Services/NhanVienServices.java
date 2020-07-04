package com.furama.furama.Services;

import com.furama.furama.Models.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NhanVienServices {
    List<NhanVien> findAll ();
    Page<NhanVien> findAll(Pageable pageable);
    NhanVien findById (Integer id);
    void save(NhanVien nhanVien);
}
