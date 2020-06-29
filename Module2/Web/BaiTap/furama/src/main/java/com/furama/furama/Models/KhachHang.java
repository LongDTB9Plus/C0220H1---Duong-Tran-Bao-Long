package com.furama.furama.Models;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "khach_hang")
public class KhachHang implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_khach_hang")
    private Integer id;
    @Column(name = "ma_khach_hang")
    private String code;
    @Column(name = "Ho_ten")
    private String name;
    @Column(name = "Ngay_sinh")
    private Date birthDay;
    @Column(name = "So_CMND")
    private String cmnd;
    @Column(name = "SDT")
    private String phoneNumber;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Dia_chi")
    private String Address;

    @ManyToOne
    @JoinColumn(name = "ID_loai_khach")
    private LoaiKhach loaiKhach;

    @OneToMany(mappedBy = "khachHang",cascade = CascadeType.ALL)
    List<HopDong> listHopDongKhachHang;

    public KhachHang() {
    }

    public KhachHang(String code,String name, Date birthDay, String cmnd, String phoneNumber,
                     String email, String address, LoaiKhach loaiKhach) {
        this.code = code;
        this.name = name;
        this.birthDay = birthDay;
        this.cmnd = cmnd;
        this.phoneNumber = phoneNumber;
        Email = email;
        Address = address;
        this.loaiKhach = loaiKhach;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<HopDong> getListHopDongKhachHang() {
        return listHopDongKhachHang;
    }

    public void setListHopDongKhachHang(List<HopDong> listHopDongKhachHang) {
        this.listHopDongKhachHang = listHopDongKhachHang;
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        KhachHang khachHang = (KhachHang) target;
        if (!(khachHang.phoneNumber.matches("((^|, )(090|091|\\(84\\)\\+|\\(84\\)\\+))+[0-9]{7}$"))) {
            errors.rejectValue("phoneNumber", "errorPhoneNumber");
        }
        if(!(khachHang.cmnd.matches("^((\\d{9})|(\\d{12}))$"))){
            errors.rejectValue("cmnd","errorCmnd");
        }
        if ((!khachHang.code.matches("^(KH-)[0-9]{4}$"))){
            errors.rejectValue("code","errorCodeKhachHang");
        }

    }
}
