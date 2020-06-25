package com.furama.furama.Services;

import com.furama.furama.Models.DichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


public interface DichVuServices {
    void save(DichVu dichVu);
    Page<DichVu> findAll(Pageable pageable);
}
