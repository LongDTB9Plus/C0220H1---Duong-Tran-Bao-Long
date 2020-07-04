package com.furama.furama.Services.Impl;

import com.furama.furama.Models.BoPhan;
import com.furama.furama.Repository.BoPhanRepository;
import com.furama.furama.Services.BoPhanServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoPhanServicesImpl implements BoPhanServices {
    @Autowired
    BoPhanRepository boPhanRepository;
    @Override
    public List<BoPhan> findAll() {
        return boPhanRepository.findAll();
    }
}
