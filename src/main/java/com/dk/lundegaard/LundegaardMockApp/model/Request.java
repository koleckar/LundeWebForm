package com.dk.lundegaard.LundegaardMockApp.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "request_type_id")
    private RequestType requestType;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private String requestMessage;


    public Request() {
    }

    public Request(Long id, RequestType requestType, Customer customer, String requestMessage) {
        this.id = id;
        this.requestType = requestType;
        this.customer = customer;
        this.requestMessage = requestMessage;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(id, request.id) && Objects.equals(requestType, request.requestType) && Objects.equals(customer, request.customer) && Objects.equals(requestMessage, request.requestMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, requestType, customer, requestMessage);
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", requestType=" + requestType +
                ", customer=" + customer +
                ", requestMessage='" + requestMessage + '\'' +
                '}';
    }
}
