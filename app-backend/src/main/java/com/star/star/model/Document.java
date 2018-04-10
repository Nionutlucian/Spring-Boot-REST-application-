package com.star.star.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue
    private int id_document;

    @Column
    private String tipDocument;

    @Column
    private String descriereDocument;

    @Column
    private Date dataDeschidere;

    @Column
    private Date dataExpirare;


    @Column(name = "id_user")
    private int id_user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nume_dosar",insertable = false, updatable = false)
    private Dosar dosar;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user",insertable = false, updatable = false)
    private User user;


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

    @Column
    private String nume_dosar;

    public int getId_document() {
        return id_document;
    }

    public void setId_document(int id_document) {
        this.id_document = id_document;
    }

    public String getNumeDosar() {
        return nume_dosar;
    }

    public void setNumeDosar(String numeDosar) {
        this.nume_dosar = numeDosar;
    }

    public String getTipDocument() {
        return tipDocument;
    }

    public void setTipDocument(String tipDocument) {
        this.tipDocument = tipDocument;
    }

    public String getDescriereDocument() {
        return descriereDocument;
    }

    public void setDescriereDocument(String descriereDocument) {
        this.descriereDocument = descriereDocument;
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

    public Dosar getDosar() {
        return dosar;
    }

    public void setDosar(Dosar dosar) {
        this.dosar = dosar;
    }
}
