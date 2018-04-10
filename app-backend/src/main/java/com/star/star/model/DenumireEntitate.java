package com.star.star.model;

import javax.persistence.*;

@Entity
@Table(name = "denumire_entitate")
public class DenumireEntitate {

    @Id
    @GeneratedValue
    private int id_entitate;

    @Column(name = "denumire")
    private String denumireEntitate;

    public int getId_entitate() {
        return id_entitate;
    }

    public void setId_entitate(int id_entitate) {
        this.id_entitate = id_entitate;
    }

    public String getDenumireEntitate() {
        return denumireEntitate;
    }

    public void setDenumireEntitate(String denumireEntitate) {
        this.denumireEntitate = denumireEntitate;
    }


}
