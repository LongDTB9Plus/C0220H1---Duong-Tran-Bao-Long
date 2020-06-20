package com.furama.furama.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ViTri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ViTri;
    @OneToMany(mappedBy = "viTri")
    private List<NhanVien> nhanVienList;

    public ViTri() {
    }

    public ViTri(String viTri) {
        ViTri = viTri;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getViTri() {
        return ViTri;
    }

    public void setViTri(String viTri) {
        ViTri = viTri;
    }

    public List<NhanVien> getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(List<NhanVien> nhanVienList) {
        this.nhanVienList = nhanVienList;
    }
}
