package com.parmar.couchbase.couchbasedemo.controller;

import com.parmar.couchbase.couchbasedemo.model.Customer;
import com.parmar.couchbase.couchbasedemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class CustomerController {

    @Autowired
    private WebClient webClient;

    @Autowired
    private CustomerService<Customer> service;
    public Customer save(Customer customer) {
        return service.save(customer);
    }
}
