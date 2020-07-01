package com.furama.furama.Repository;
import com.furama.furama.Models.HopDong;
import com.furama.furama.Models.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

public interface KhachHangRepository extends JpaRepository<KhachHang,Integer> {
    @Query(value = "SELECT * FROM khach_hang " +
            "LEFT JOIN hop_dong " +
            "on (khach_hang.id_khach_hang = hop_dong.id_khach_hang) " +
            "where hop_dong.ngay_ket_thuc > ?1",nativeQuery = true)
    List<KhachHang> findAllStillActive(LocalDateTime date);

    List<KhachHang> findKhachHangByCode (String code);
    Page<KhachHang> findAllByAddressContainingOrBirthDayContainingOrNameContainingOrPhoneNumberContainingOrCmndContainingOrEmailContainingOrCodeContaining(String address, String birthDay, String name, String phoneNumber, String cmnd, String email, String code, Pageable pageable);
}
