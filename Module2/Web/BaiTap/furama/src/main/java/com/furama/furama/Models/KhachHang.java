package com.furama.furama.Models;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Date birthDay;
    private String cmnd;
    private String phoneNumber;
    private String Email;
    private String Address;

    @ManyToOne
    @JoinColumn(name = "id_loai_khach")
    private LoaiKhach loaiKhach;

    public KhachHang() {
    }

    public KhachHang(String name, Date birthDay, String cmnd, String phoneNumber,
                     String email, String address, LoaiKhach loaiKhach) {
        this.name = name;
        this.birthDay = birthDay;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        Email = email;
        Address = address;
        this.loaiKhach = loaiKhach;
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

    public LoaiKhach getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(LoaiKhach loaiKhach) {
        this.loaiKhach = loaiKhach;
    }
}
