package com.star.star.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.print.Doc;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "dosar")
public class Dosar {

    @Id
    @GeneratedValue
    private int id_dosar;

    @Column(unique = true)
    private String numeDosar;

    @Column
    private String entitateContractanta;

    @Column
    private String tipContract;

    @Column
    private String descriereContract;

    @Column
    private Date dataDeschidere;

    @Column
    private Date dataExpirare;

    @Column(name = "id_user")
    private int id_user;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user",insertable = false, updatable = false)
    @JsonBackReference
    private User user;

    public List<Document> getDocument() {
        return document;
    }

    public void setDocument(List<Document> document) {
        this.document = document;
    }

    @OneToMany(fetch = FetchType.LAZY)
    private List<Document> document;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id_dosar;
    }

    public void setId(int id) {
        this.id_dosar = id;
    }

    public String getNumeDosar() {
        return numeDosar;
    }

    public void setNumeDosar(String numeDosar) {
        this.numeDosar = numeDosar;
    }

    public String getEntitateContractanta() {
        return entitateContractanta;
    }

    public void setEntitateContractanta(String entitateContractanta) {
        this.entitateContractanta = entitateContractanta;
    }

    public String getTipContract() {
        return tipContract;
    }

    public void setTipContract(String tipContract) {
        this.tipContract = tipContract;
    }

    public String getDescriereContract() {
        return descriereContract;
    }

    public void setDescriereContract(String descriereContract) {
        this.descriereContract = descriereContract;
    }

    public Date getDataDeschidere() {
        return dataDeschidere;
    }

    public void setDataDeschidere(Date dataDeschidere) {
        this.dataDeschidere = dataDeschidere;
    }

    public Date getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(Date dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

}
