package com.furama.furama.Models;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer amount;
    @ManyToOne
    @JoinColumn(name = "id_dich_vu_di_kem")
    private DichVuDiKem dichVuDiKem;
}
