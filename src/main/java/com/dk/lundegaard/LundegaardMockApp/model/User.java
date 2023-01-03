package com.dk.lundegaard.LundegaardMockApp.model;

import jakarta.persistence.*;

import java.util.Objects;

//@Entity
//@Table(name="USER", schema = "LUNDEMOCKAPP")
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String Surname;
    private Integer policyNumber;


    public User() {
    }

    public User(Long id, String name, String surname, Integer policyNumber) {
        this.id = id;
        this.name = name;
        Surname = surname;
        this.policyNumber = policyNumber;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Integer getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(Integer policyNumber) {
        this.policyNumber = policyNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name)
                && Objects.equals(Surname, user.Surname) && Objects.equals(policyNumber, user.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, Surname, policyNumber);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", policyNumber=" + policyNumber +
                '}';
    }

}
