package com.dk.lundegaard.LundegaardMockApp.controller;

import com.dk.lundegaard.LundegaardMockApp.model.Request;
import com.dk.lundegaard.LundegaardMockApp.model.RequestRepository;
import com.dk.lundegaard.LundegaardMockApp.model.RequestTypeRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RequestPageController {
    private final RequestTypeRepository requestTypeRepository;
    private final RequestRepository requestRepository;

    public RequestPageController(RequestTypeRepository requestTypeRepository,
                                 RequestRepository requestRepository) {
        System.out.println("Initializing controller");
        this.requestTypeRepository = requestTypeRepository;
        this.requestRepository = requestRepository;
    }

    @GetMapping
    public String retrieveAllRequestTypes(Model model) {
        model.addAttribute("request_types", requestTypeRepository.findAll());
        return "index";
    }

    @PostMapping
    public String submitRequest(@Valid Request request, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) return "index";

        requestRepository.save(request);
        return "index"; // TODO: return succesfull message - or display new view with submited info.
    }
}


//@ Valid validate by JPA rules put on the DTA
// BindingResult has to be after request, order matters