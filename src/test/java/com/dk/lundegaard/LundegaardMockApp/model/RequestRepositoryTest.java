package com.dk.lundegaard.LundegaardMockApp.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
public class RequestRepositoryTest {

    @Autowired
    private RequestTypeRepository requestTypeRepository;

    @Test
    public void exactly3RequestTypes() {
        assertTrue(requestTypeRepository.findAll().size() == 3);
    }

    @Test
    public void requestTypesAreCorrect() {
        var s = List.of(
                new RequestType(1L, "Contract Adjustment"),
                new RequestType(2L, "Damage report"),
                new RequestType(3L, "Complaint")
        );
    }

}
