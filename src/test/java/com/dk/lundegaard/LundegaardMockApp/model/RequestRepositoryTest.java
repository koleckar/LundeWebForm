package com.dk.lundegaard.LundegaardMockApp.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RequestRepositoryTest {

    @Autowired
    RequestRepository requestRepository;

    @Test
    public void dbIsRunning(){
        System.out.println(requestRepository.count());
        requestRepository.findAll().forEach(System.out::println);
    }

}
