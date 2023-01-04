package com.dk.lundegaard.LundegaardMockApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Objects;

import static com.dk.lundegaard.LundegaardMockApp.utils.Constants.*;


@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "request_type_id")
    @NotNull
    private RequestType requestType;
    @NotNull
    @Size(min = POLICY_NUMBER_LEN, max = POLICY_NUMBER_LEN,
            message = "Policy Number must be " + POLICY_NUMBER_LEN + " characters long.")
    @Pattern(regexp = "^\\p{Alnum}+$", message = "Only alphanumeric characters allowed.")
    private String policyNumber;
    @NotNull
    @Size(min = MIN_NAME_LEN, max = MAX_NAME_LEN,
            message = "Name must be between " + MIN_NAME_LEN + " and " + MAX_NAME_LEN + " characters.")
    @Pattern(regexp = "^\\p{Alpha}+$",  message = "Only alpha (non-numeric) characters allowed.")
    private String name;
    @NotNull
    @Size(min = MIN_SURNAME_LEN, max = MAX_SURNAME_LEN,
            message = "Surname must be between " + MIN_SURNAME_LEN + " and " + MAX_SURNAME_LEN + " characters.")
    @Pattern(regexp = "^\\p{Alpha}+$",  message = "Only alpha (non-numeric) characters allowed.")
    private String surname;

    @NotNull
    @Size(min = MIN_REQUEST_MESSAGE_LEN, max = MAX_REQUEST_MESSAGE_LEN,
            message = "Text must be between " + MIN_REQUEST_MESSAGE_LEN + " and " + MAX_REQUEST_MESSAGE_LEN + " characters.")
    private String requestMessage;


    public Request() {
    }

    public Request(Long id, RequestType requestType, String name, String surname, String policyNumber, String requestMessage) {
        this.id = id;
        this.requestType = requestType;
        this.name = name;
        this.surname = surname;
        this.policyNumber = policyNumber;
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

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
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
        return Objects.equals(id, request.id)
                && Objects.equals(requestType, request.requestType)
                && Objects.equals(name, request.name)
                && Objects.equals(surname, request.surname)
                && Objects.equals(policyNumber, request.policyNumber)
                && Objects.equals(requestMessage, request.requestMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, requestType, name, surname, policyNumber, requestMessage);
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", requestType='" + requestType + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", policyNumber='" + policyNumber + '\'' +
                ", requestMessage='" + requestMessage + '\'' +
                '}';
    }

}
