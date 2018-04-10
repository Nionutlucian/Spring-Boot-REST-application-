package com.star.star.model;

import javax.persistence.*;

@Entity
@Table(name = "tip_contract")
public class TipContract {

    @Id
    @GeneratedValue
    private int id_tip_contract;

    @Column(name = "tip_contract")
    private String tipContract;

    public int getId_tip_contract() {
        return id_tip_contract;
    }

    public void setId_tip_contract(int id_tip_contract) {
        this.id_tip_contract = id_tip_contract;
    }

    public String getTipContract() {
        return tipContract;
    }

    public void setTipContract(String tipContract) {
        this.tipContract = tipContract;
    }
}
