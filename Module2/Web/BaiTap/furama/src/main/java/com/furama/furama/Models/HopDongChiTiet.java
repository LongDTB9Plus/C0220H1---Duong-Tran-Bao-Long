package com.furama.furama.Models;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Table(name = "hop_dong_chi_tiet")
public class HopDongChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_hop_dong_chi_tiet")
    private Integer id;
    @Column(name = "So_luong")
    @Min(value = 0,message = "Phả là số nguyên dương")
    private Integer amount;
    @ManyToOne
    @JoinColumn(name = "ID_dich_vu_di_kem")
    private DichVuDiKem dichVuDiKem;
    @ManyToOne
    @JoinColumn(name = "ID_hop_dong")
    private HopDong hopDong;

    public HopDongChiTiet() {
    }

    public HopDongChiTiet(Integer amount, DichVuDiKem dichVuDiKem, HopDong hopDong) {
        this.amount = amount;
        this.dichVuDiKem = dichVuDiKem;
        this.hopDong = hopDong;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }
}
