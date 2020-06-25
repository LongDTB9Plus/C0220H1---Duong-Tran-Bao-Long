package com.furama.furama.Models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "loai_khach")
public class LoaiKhach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_loai_khach")
    private Integer id;
    @Column(name = "Ten_loai_khach")
    private String Ten;
    @OneToMany(mappedBy = "loaiKhach",cascade = CascadeType.ALL)
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
