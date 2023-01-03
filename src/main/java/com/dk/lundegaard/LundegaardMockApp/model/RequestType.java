package com.dk.lundegaard.LundegaardMockApp.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class RequestType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String requestType;

    public RequestType() {
    }

    public RequestType(Long id, String requestType) {
        this.id = id;
        this.requestType = requestType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestType that = (RequestType) o;
        return Objects.equals(id, that.id) && Objects.equals(requestType, that.requestType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, requestType);
    }

}
