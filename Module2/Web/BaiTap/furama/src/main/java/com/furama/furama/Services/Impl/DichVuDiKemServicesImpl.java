package com.furama.furama.Services.Impl;

import com.furama.furama.Models.DichVuDiKem;
import com.furama.furama.Repository.DichVuDiKemRepository;
import com.furama.furama.Services.DichVuDiKemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DichVuDiKemServicesImpl implements DichVuDiKemServices {
    @Autowired
    DichVuDiKemRepository dichVuDiKemRepository;

    @Override
    public List<DichVuDiKem> findAll() {
        return dichVuDiKemRepository.findAll();
    }
}
