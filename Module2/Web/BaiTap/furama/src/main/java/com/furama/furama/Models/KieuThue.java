package com.furama.furama.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kieu_thue")
public class KieuThue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_kieu_thue")
    private Integer id;
    @Column(name = "Ten_kieu_thue")
    private String name;
    @Column(name = "Gia")
    private Double price;
    @OneToMany(mappedBy = "kieuThue",cascade = CascadeType.ALL)
    List<DichVu> listDichVu;

    public KieuThue() {
    }

    public KieuThue(String name, Double price, List<DichVu> listDichVu) {
        this.name = name;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<DichVu> getListDichVu() {
        return listDichVu;
    }

    public void setListDichVu(List<DichVu> listDichVu) {
        this.listDichVu = listDichVu;
    }
}
