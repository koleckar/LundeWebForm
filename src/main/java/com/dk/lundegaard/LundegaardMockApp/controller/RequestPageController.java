package com.dk.lundegaard.LundegaardMockApp.controller;

import com.dk.lundegaard.LundegaardMockApp.model.RequestTypeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RequestPageController {
    private final RequestTypeRepository requestTypeRepository;

    public RequestPageController(RequestTypeRepository requestTypeRepository) {
        System.out.println("Initializing controller");
        this.requestTypeRepository = requestTypeRepository;
    }

    @GetMapping
    public String retrieveAllRequestTypes(Model model) {
        System.out.println(requestTypeRepository.findAll().getClass());
        model.addAttribute("request_types", requestTypeRepository.findAll());
        return "index";
    }


}
