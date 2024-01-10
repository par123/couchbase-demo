package com.parmar.couchbase.couchbasedemo.serviceImpl;

import com.parmar.couchbase.couchbasedemo.model.Customer;
import com.parmar.couchbase.couchbasedemo.repository.CustomerRepository;
import com.parmar.couchbase.couchbasedemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService<Customer> {

    @Autowired
    private CustomerRepository repository;
    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Customer get(String id) {
        return repository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public Customer update(Customer customer) {
        return null;
    }
}
