package com.furama.furama.Models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
@Table(name = "nhan_vien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_nhan_vien")
    private Integer id;
    @Column(name = "Ho_ten")
    private String Name;
    @Column(name = "Ngay_sinh")
    private String birthDay;
    @Column(name = "So_CMND")
    private String cmnd;
    @Column(name = "Luong")
    @Min(value = 0)
    private Double Luong;
    @Column(name = "SDT")
    private String phoneNumber;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Dia_chi")
    private String Address;

    @ManyToOne
    @JoinColumn(name = "ID_bo_phan")
    BoPhan boPhan;

    @ManyToOne
    @JoinColumn(name = "ID_vi_tri")
    ViTri viTri;

    @ManyToOne
    @JoinColumn(name = "ID_trinh_do")
    TrinhDo trinhDo;

    @OneToMany(mappedBy = "nhanVien",cascade = CascadeType.ALL)
    List<HopDong> listHopDongNhanVien;

    public NhanVien() {
    }

    public NhanVien(String name, String birthDay, String cmnd, Double luong,
                    String phoneNumber, String email, String address, BoPhan boPhan,
                    ViTri viTri, TrinhDo trinhDo) {
        Name = name;
        this.birthDay = birthDay;
        this.cmnd = cmnd;
        Luong = luong;
        this.phoneNumber = phoneNumber;
        Email = email;
        Address = address;
        this.boPhan = boPhan;
        this.viTri = viTri;
        this.trinhDo = trinhDo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public Double getLuong() {
        return Luong;
    }

    public void setLuong(Double luong) {
        Luong = luong;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public BoPhan getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(BoPhan boPhan) {
        this.boPhan = boPhan;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    public TrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(TrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }
}
