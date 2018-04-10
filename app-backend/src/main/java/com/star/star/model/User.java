package com.star.star.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    int id_user;

    @Column(unique = false)
    String firstName;

    @Column(unique = false)
    String lastName;

    @Column(unique = true)
    String email;

    @Column(unique = true)
    String username;

    @Column(unique = false)
    String password;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Dosar> dosare;


    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Document> documente;

    public List<Document> getDocumente() {
        return documente;
    }

    public void setDocumente(List<Document> documente) {
        this.documente = documente;
    }


    public int getId() {
        return id_user;
    }

    public void setId(int id) {
        this.id_user = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Dosar> getDosare() {
        return dosare;
    }

    public void setDosare(List<Dosar> dosare) {
        this.dosare = dosare;
    }


}
