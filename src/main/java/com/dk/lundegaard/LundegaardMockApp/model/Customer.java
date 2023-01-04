package com.dk.lundegaard.LundegaardMockApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Objects;
import static com.dk.lundegaard.LundegaardMockApp.utils.Constants.*;

@Entity
public class Customer {
    //TODO: migrate this class to Request

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @Min(MIN_NAME_LEN)
    @Pattern(regexp = "^\\p{Alpha}+$")
    private String name;
    @NotNull
    @Min(MIN_SURNAME_LEN)
    @Pattern(regexp = "^\\p{Alpha}+$")
    private String surname;
    @NotNull
    @Min(POLICY_NUMBER_LEN)
    @Max(POLICY_NUMBER_LEN)
    @Pattern(regexp = "^\\p{Alnum}+$")
    private String policyNumber; //TODO: make string


    public Customer() {
    }

    public Customer(Long id, String name, String surname, String policyNumber) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name)
                && Objects.equals(surname, customer.surname) && Objects.equals(policyNumber, customer.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, policyNumber);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", policyNumber=" + policyNumber +
                '}';
    }
}
