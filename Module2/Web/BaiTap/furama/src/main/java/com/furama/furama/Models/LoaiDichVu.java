package com.furama.furama.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loai_dich_vu")
public class LoaiDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_loai_dich_vu")
    private Integer id;
    @Column(name = "Ten_dich_vu")
    private String name;
    @OneToMany(mappedBy = "loaiDichVu",cascade = CascadeType.ALL)
    List<DichVu> listDichVu;

    public LoaiDichVu() {
    }

    public LoaiDichVu(String name, List<DichVu> listDichVu) {
        this.name = name;
        this.listDichVu = listDichVu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DichVu> getListDichVu() {
        return listDichVu;
    }

    public void setListDichVu(List<DichVu> listDichVu) {
        this.listDichVu = listDichVu;
    }
}
