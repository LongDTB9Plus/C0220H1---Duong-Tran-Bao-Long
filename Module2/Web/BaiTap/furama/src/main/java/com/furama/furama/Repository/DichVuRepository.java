package com.furama.furama.Repository;

import com.furama.furama.Models.DichVu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DichVuRepository extends JpaRepository<DichVu,Integer> {
    List<DichVu> findDichVuByCode (String code);
}
