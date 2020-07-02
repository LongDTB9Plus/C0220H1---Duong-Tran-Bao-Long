package com.furama.furama.Services.Impl;

import com.furama.furama.Models.KieuThue;
import com.furama.furama.Repository.KieuThueRepository;
import com.furama.furama.Services.KieuThueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KieuThueServicesImpl implements KieuThueService {

    @Autowired
    KieuThueRepository kieuThueRepository;


    @Override
    public List<KieuThue> findAll() {
        return kieuThueRepository.findAll();
    }
}
