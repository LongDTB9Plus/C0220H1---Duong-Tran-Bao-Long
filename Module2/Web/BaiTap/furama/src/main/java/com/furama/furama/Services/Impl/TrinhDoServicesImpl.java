package com.furama.furama.Services.Impl;

import com.furama.furama.Models.TrinhDo;
import com.furama.furama.Repository.TrinhDoRepository;
import com.furama.furama.Services.TrinhDoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrinhDoServicesImpl implements TrinhDoServices {
    @Autowired
    TrinhDoRepository trinhDoRepository;
    @Override
    public List<TrinhDo> findAll() {
        return trinhDoRepository.findAll();
    }
}
