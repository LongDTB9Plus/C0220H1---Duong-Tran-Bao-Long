package com.furama.furama.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vi_tri")
public class ViTri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_vi_tri")
    private Integer id;
    @Column(name = "Ten_vi_tri")
    private String ViTri;
    @OneToMany(mappedBy = "viTri",cascade = CascadeType.ALL)
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
