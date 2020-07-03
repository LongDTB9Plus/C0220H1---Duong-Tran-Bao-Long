package com.furama.furama.Services;

import com.furama.furama.Models.DichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

import java.util.List;
import java.util.Optional;


public interface DichVuServices extends Validator {
    void save(DichVu dichVu);

    Page<DichVu> findAll(Pageable pageable);

    List<DichVu> findDichVuByCode(String code);

    List<DichVu> findAll();

    void remove(DichVu dichVu);

    DichVu findById(Integer id);
}
