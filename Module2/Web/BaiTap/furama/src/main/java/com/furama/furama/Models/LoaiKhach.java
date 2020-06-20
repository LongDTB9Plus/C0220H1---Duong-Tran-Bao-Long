package com.furama.furama.Models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class LoaiKhach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Ten;
    @OneToMany(mappedBy = "loaiKhach")
    List<KhachHang> khachHangList;

    public List<KhachHang> getKhachHangList() {
        return khachHangList;
    }

    public void setKhachHangList(List<KhachHang> khachHangList) {
        this.khachHangList = khachHangList;
    }

    public LoaiKhach() {
    }

    public LoaiKhach(String ten) {
        Ten = ten;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }
}
