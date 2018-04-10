package com.star.star.model;


import javax.persistence.*;

@Entity
@Table(name = "tip_document")
public class TipDocument {

    @Id
    @GeneratedValue
    private int id;

    @Column
    private String tipDoc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipDoc() {
        return tipDoc;
    }

    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }
}
