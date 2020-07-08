package com.furama.furama.Services;

import com.furama.furama.Models.HopDong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.Validator;

public interface HopDongServices extends Validator {
    void save(HopDong hopDong);
    Page<HopDong> findAll(Pageable pageable);
    HopDong findById(Integer id);
}
