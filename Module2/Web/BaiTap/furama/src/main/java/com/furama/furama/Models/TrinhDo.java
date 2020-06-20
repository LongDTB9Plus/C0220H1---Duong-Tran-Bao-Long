package com.furama.furama.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class TrinhDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String TrinhDo;
    @OneToMany(mappedBy = "trinhDo")
    private List<NhanVien> nhanVienList;

    public TrinhDo() {

    }

    public TrinhDo(String trinhDo) {
        TrinhDo = trinhDo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        TrinhDo = trinhDo;
    }

    public List<NhanVien> getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(List<NhanVien> nhanVienList) {
        this.nhanVienList = nhanVienList;
    }
}
