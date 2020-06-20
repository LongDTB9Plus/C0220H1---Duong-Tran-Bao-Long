package com.furama.furama.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class DichVuDiKem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double price;
    private Integer unit;
    private Boolean status;
    @OneToMany(mappedBy = "dichVuDiKem")
    List<ContractDetail> contractDetailList;

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

    public List<ContractDetail> getContractDetailList() {
        return contractDetailList;
    }

    public void setContractDetailList(List<ContractDetail> contractDetailList) {
        this.contractDetailList = contractDetailList;
    }
}
