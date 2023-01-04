package com.dk.lundegaard.LundegaardMockApp.controller;

import com.dk.lundegaard.LundegaardMockApp.model.Request;
import com.dk.lundegaard.LundegaardMockApp.model.RequestRepository;
import com.dk.lundegaard.LundegaardMockApp.model.RequestTypeRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RequestPageController {

    private final RequestTypeRepository requestTypeRepository;
    private final RequestRepository requestRepository;


    public RequestPageController(RequestTypeRepository requestTypeRepository,
                                 RequestRepository requestRepository) {
        System.out.println("Initializing controller");
        this.requestTypeRepository = requestTypeRepository;
        this.requestRepository = requestRepository;
    }


    @GetMapping("/")
    public String initializeRequestPage(Model model) {
        System.err.println("GET");
        model.addAttribute("request", new Request());
        model.addAttribute("request_types", requestTypeRepository.findAll());
        return "index";
    }

    @PostMapping("/")
    public String submitRequest(@Valid @ModelAttribute("request") Request request,
                                BindingResult bindingResult, Model model) {
        System.err.println("POST");
        System.out.println(request);
        model.addAttribute("request_types", requestTypeRepository.findAll());
        if (bindingResult.hasErrors()) {
            System.err.println("binding has errs");
            return "index";
        }

        requestRepository.save(request);
        return "index";
    }

}


//@ Valid validate by JPA rules put on the DTA
// BindingResult has to be after request, order matters