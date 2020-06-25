package com.furama.furama.Services.Impl;

import com.furama.furama.Models.HopDong;
import com.furama.furama.Repository.HopDongRepository;
import com.furama.furama.Services.HopDongServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HopDongServicesImpl implements HopDongServices {
    @Autowired
    HopDongRepository hopDongRepository;
    @Override
    public void save(HopDong hopDong) {
        hopDongRepository.save(hopDong);
    }
}
