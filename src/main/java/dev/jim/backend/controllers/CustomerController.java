package dev.jim.backend.controllers;


import dev.jim.backend.entities.Customer;
import dev.jim.backend.services.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerServiceImp service;

    @GetMapping("/api/customers")
    public List<Customer> getAll() {
        return service.getAll();
    }

}
