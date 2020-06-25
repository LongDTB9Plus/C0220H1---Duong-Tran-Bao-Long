package com.furama.furama.Models;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hop_dong")
public class HopDong implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_hop_dong")
    private Integer id;
    @Column(name = "Ngay_lam_hop_dong")
    private String dateStart;
    @Column(name = "Ngay_ket_thuc")
    private String dateEnd;
    @Column(name = "Tien_dat_coc")
    private Double datCoc;
    @Column(name = "Tong_tien")
    private Double tongTien;
    @OneToMany(mappedBy = "hopDong", cascade = CascadeType.ALL)
    List<HopDongChiTiet> listHopDongChiTiet;
    @ManyToOne
    @JoinColumn(name = "ID_khach_hang")
    KhachHang khachHang;
    @ManyToOne
    @JoinColumn(name = "ID_nhan_vien")
    NhanVien nhanVien;
    @ManyToOne
    @JoinColumn(name = "ID_dich_vu")
    DichVu dichVu;

    public HopDong() {
    }

    public HopDong(String dateStart, String dateEnd, Double datCoc,
                   Double tongTien, List<HopDongChiTiet> listHopDongChiTiet,
                   KhachHang khachHang, NhanVien nhanVien, DichVu dichVu) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.datCoc = datCoc;
        this.tongTien = tongTien;
        this.listHopDongChiTiet = listHopDongChiTiet;
        this.khachHang = khachHang;
        this.nhanVien = nhanVien;
        this.dichVu = dichVu;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Double getDatCoc() {
        return datCoc;
    }

    public void setDatCoc(Double datCoc) {
        this.datCoc = datCoc;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public List<HopDongChiTiet> getListHopDongChiTiet() {
        return listHopDongChiTiet;
    }

    public void setListHopDongChiTiet(List<HopDongChiTiet> listHopDongChiTiet) {
        this.listHopDongChiTiet = listHopDongChiTiet;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        HopDong hopDong = (HopDong) target;
    }
}
