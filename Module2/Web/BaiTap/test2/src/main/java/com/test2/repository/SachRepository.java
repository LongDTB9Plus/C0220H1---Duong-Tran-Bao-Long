package com.test2.repository;

import com.test2.entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SachRepository extends JpaRepository<Sach,Integer> {
    List<Sach> findAllByMaSach(Integer maSach);
    List<Sach> findAllByTenSachContaining(String tenSach);
}
