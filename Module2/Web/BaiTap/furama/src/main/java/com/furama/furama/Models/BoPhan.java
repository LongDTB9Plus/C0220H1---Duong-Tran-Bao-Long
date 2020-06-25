package com.furama.furama.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "bo_phan")
public class BoPhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_bo_phan")
    private Integer id;
    @Column(name = "Ten_bo_phan")
    private String BoPhan;
    @OneToMany(mappedBy = "boPhan",cascade = CascadeType.ALL)
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
