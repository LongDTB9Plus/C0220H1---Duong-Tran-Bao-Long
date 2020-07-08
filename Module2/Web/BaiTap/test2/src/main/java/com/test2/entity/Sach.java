package com.test2.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Sach implements Validator {
    @Id
    private Integer maSach;
    @NotBlank(message = "Không Được Để Trống")
    @Size(max = 30, message = "Độ Dài Không Quá 30 Ký Tự")
    private String tenSach;
    @NotBlank(message = "Không Được Để Trống")
    private String gia;
    @NotBlank(message = "Không Được Để Trống")
    @Size(max = 30, message = "Độ Dài Không Quá 30 Ký Tự")
    private String tacGia;

    public Sach() {
    }

    public Sach(Integer maSach, String tenSach, String gia, String tacGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.gia = gia;
        this.tacGia = tacGia;
    }

    public Integer getMaSach() {
        return maSach;
    }

    public void setMaSach(Integer maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        Sach sach = (Sach) target;
        if (sach.maSach == null){
            errors.rejectValue("maSach","Sach.maSach");
        }
        if (!(sach.gia.matches("^[0-9]+(.[0-9])*$"))) {
            errors.rejectValue("gia", "Sach.gia");
        } else {
            Double gia = Double.parseDouble(sach.getGia());
            if (gia < 10000) {
                errors.rejectValue("gia", "Sach.gia");
            }
        }
        if (!(sach.maSach.toString().matches("^[0-9]+$"))){
            errors.rejectValue("maSach","Sach.maSach");
        }
    }
}
