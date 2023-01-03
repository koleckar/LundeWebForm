package com.dk.lundegaard.LundegaardMockApp.utils;

import com.dk.lundegaard.LundegaardMockApp.model.RequestType;
import com.dk.lundegaard.LundegaardMockApp.model.RequestTypeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitializeRequestTypes {
    private final RequestTypeRepository repository;

    public InitializeRequestTypes(RequestTypeRepository requestTypeRepository) {
        this.repository = requestTypeRepository;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Initializing request types");
        repository.saveAll(List.of(
                new RequestType(null, "Contract Adjustment"),
                new RequestType(null, "Damage report"),
                new RequestType(null, "Complaint")));
    }
}
