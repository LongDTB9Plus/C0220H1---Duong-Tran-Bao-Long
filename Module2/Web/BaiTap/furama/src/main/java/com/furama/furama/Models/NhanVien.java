package com.furama.furama.Models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Name;
    private Date birthDay;
    private String cmnd;
    private Double Luong;
    private String phoneNumber;
    private String Email;
    private String Address;

    @ManyToOne
    @JoinColumn(name = "id_bo_phan")
    BoPhan boPhan;

    @ManyToOne
    @JoinColumn(name = "id_vi_tri")
    ViTri viTri;

    @ManyToOne
    @JoinColumn(name = "id_trinh_do")
    TrinhDo trinhDo;

    public NhanVien() {
    }

    public NhanVien(String name, Date birthDay, String cmnd, Double luong,
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

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
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
