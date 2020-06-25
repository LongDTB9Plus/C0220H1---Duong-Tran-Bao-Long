package com.furama.furama.Models;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
@Table(name = "dich_vu")
public class DichVu implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_dich_vu")
    private Integer id;
    @Column(name="ma_dich_vu")
    private String code;
    @Column(name = "Ten_dich_vu")
    private String name;
    @Column(name = "Dien_tich")
    private Double area;
    @Column(name = "So_tang")
    @Min(value = 0)
    private Integer floor;
    @Column(name = "So_nguoi_toi_da")
    private Integer maxPeople;
    @Column(name = "Chi_phi_thue")
    private Double price;
    @Column(name = "Trang_thai")
    private String status;
    @ManyToOne
    @JoinColumn(name = "ID_loai_dich_vu")
    LoaiDichVu loaiDichVu;
    @ManyToOne
    @JoinColumn(name = "ID_kieu_thue")
    KieuThue kieuThue;
    @OneToMany(mappedBy = "dichVu", cascade = CascadeType.ALL)
    List<HopDong> listHopDong;

    public DichVu(String code,String name, Double area, Integer floor,
                  Integer maxPeople, Double price, String status,
                  LoaiDichVu loaiDichVu, KieuThue kieuThue, List<HopDong> listHopDong) {
        this.code = code;
        this.name = name;
        this.area = area;
        this.floor = floor;
        this.maxPeople = maxPeople;
        this.price = price;
        this.status = status;
        this.loaiDichVu = loaiDichVu;
        this.kieuThue = kieuThue;
        this.listHopDong = listHopDong;
    }

    public DichVu() {
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

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LoaiDichVu getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(LoaiDichVu loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public KieuThue getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(KieuThue kieuThue) {
        this.kieuThue = kieuThue;
    }

    public List<HopDong> getListHopDong() {
        return listHopDong;
    }

    public void setListHopDong(List<HopDong> listHopDong) {
        this.listHopDong = listHopDong;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        DichVu dichVu = (DichVu) target;
    }
}
