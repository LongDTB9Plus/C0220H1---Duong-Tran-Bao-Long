package com.furama.furama.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dich_vu_di_kem")
public class DichVuDiKem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_dich_vu_di_kem")
    private Integer id;
    @Column(name = "Ten_dich_vu_di_kem")
    private String name;
    @Column(name = "Gia")
    private Double price;
    @Column(name = "Don_vi")
    private Integer unit;
    @Column(name = "Trang_thai_kha_dung")
    private Boolean status;
    @OneToMany(mappedBy = "dichVuDiKem",cascade = CascadeType.ALL)
    List<HopDongChiTiet> hopDongChiTietList;

    public DichVuDiKem() {
    }

    public DichVuDiKem(String name, Double price, Integer unit, Boolean status) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.status = status;
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

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<HopDongChiTiet> getHopDongChiTietList() {
        return hopDongChiTietList;
    }

    public void setHopDongChiTietList(List<HopDongChiTiet> hopDongChiTietList) {
        this.hopDongChiTietList = hopDongChiTietList;
    }
}
