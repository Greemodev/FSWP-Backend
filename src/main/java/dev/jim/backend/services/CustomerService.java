package dev.jim.backend.services;

import dev.jim.backend.entities.Customer;
import dev.jim.backend.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService implements CustomerServiceImp {
    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAll() {
        return (List<Customer>) repository.findAll();
    }
}
