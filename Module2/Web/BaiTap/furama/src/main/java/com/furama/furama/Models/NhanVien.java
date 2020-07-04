package com.furama.furama.Models;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "nhan_vien")
public class NhanVien implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_nhan_vien")
    private Integer id;
    @Column(name = "Ho_ten")
    private String name;
    @Column(name = "Ngay_sinh")
    private String birthDay;
    @Column(name = "So_CMND")
    private String cmnd;
    @Column(name = "Luong")
    @Min(value = 0)
    private Double luong;
    @Column(name = "SDT")
    private String phoneNumber;
    @Column(name = "Email")
    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$",
            message = "Email không được bắt đầu bằng số và không chứa kí tự đặc biệt.")
    private String email;
    @Column(name = "Dia_chi")
    private String address;

    @ManyToOne
    @JoinColumn(name = "ID_bo_phan")
    BoPhan boPhan;

    @ManyToOne
    @JoinColumn(name = "ID_vi_tri")
    ViTri viTri;

    @ManyToOne
    @JoinColumn(name = "ID_trinh_do")
    TrinhDo trinhDo;

    @OneToOne
    @JoinColumn(name = "username")
    private User user;

    @OneToMany(mappedBy = "nhanVien", cascade = CascadeType.ALL)
    List<HopDong> listHopDongNhanVien;

    public NhanVien() {
    }

    public NhanVien(String name, String birthDay, String cmnd, Double luong,
                    String phoneNumber, String email, String address, BoPhan boPhan,
                    ViTri viTri, TrinhDo trinhDo) {
        this.name = name;
        this.birthDay = birthDay;
        this.cmnd = cmnd;
        this.luong = luong;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        NhanVien nhanVien = (NhanVien) target;
        if (!(nhanVien.phoneNumber.matches("((^|, )(090|091|\\(84\\)\\+|\\(84\\)\\+))+[0-9]{7}$"))) {
            errors.rejectValue("phoneNumber", "KhachHang.phoneNumber");
        }
        if(!(nhanVien.cmnd.matches("^((\\d{9})|(\\d{12}))$"))){
            errors.rejectValue("cmnd","KhachHang.cmnd");
        }
    }
}
