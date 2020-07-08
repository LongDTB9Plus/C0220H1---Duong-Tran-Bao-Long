package com.test2.services;

import com.test2.entity.Sach;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.Validator;

import java.util.List;

public interface SachServices extends Validator {
    Page<Sach> findAll(Pageable pageable);
    Sach findById(Integer id);
    void delete(Integer id);
    void save(Sach sach);
    List<Sach> findByMaSach(Integer id);
    List<Sach> findByTenSach(String ten);
}
