package com.furama.furama.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trinh_do")
public class TrinhDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_trinh_do")
    private Integer id;
    @Column(name="Trinh_do")
    private String TrinhDo;
    @OneToMany(mappedBy = "trinhDo",cascade = CascadeType.ALL)
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
