package com.furama.furama.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class BoPhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String BoPhan;
    @OneToMany(mappedBy = "boPhan")
    private List<NhanVien> nhanVienList;

    public BoPhan() {
    }

    public BoPhan(String boPhan) {
        BoPhan = boPhan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBoPhan() {
        return BoPhan;
    }

    public void setBoPhan(String boPhan) {
        BoPhan = boPhan;
    }

    public List<NhanVien> getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(List<NhanVien> nhanVienList) {
        this.nhanVienList = nhanVienList;
    }
}
