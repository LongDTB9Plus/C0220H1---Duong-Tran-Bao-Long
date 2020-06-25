package com.furama.furama.Services.Impl;

import com.furama.furama.Models.HopDongChiTiet;
import com.furama.furama.Repository.HopDongChiTietRepository;
import com.furama.furama.Services.HopDongChiTietServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HopDongChiTietServicesImpl implements HopDongChiTietServices {
    @Autowired
    HopDongChiTietRepository hopDongChiTietRepository;
    @Override
    public void save(HopDongChiTiet hopDongChiTiet) {
        hopDongChiTietRepository.save(hopDongChiTiet);
    }
}
