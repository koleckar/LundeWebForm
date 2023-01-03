package com.dk.lundegaard.LundegaardMockApp.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestTypeRepository extends CrudRepository<RequestType, Long> {
    List<RequestType> findAll();
}
