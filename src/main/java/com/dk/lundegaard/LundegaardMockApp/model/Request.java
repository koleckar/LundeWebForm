package com.dk.lundegaard.LundegaardMockApp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Entity
@Table(name="REQUEST", schema = "LUNDEMOCKAPP")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.BIGINT)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private RequestType requestType;


    public Request() {
    }

    public Request(RequestType requestType) {
        this.requestType = requestType;
    }


}
