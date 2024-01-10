package com.parmar.couchbase.couchbasedemo.repository;

import com.parmar.couchbase.couchbasedemo.model.Customer;
import org.springframework.data.couchbase.core.CouchbaseOperations;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.query.CouchbaseEntityInformation;
import org.springframework.data.couchbase.repository.support.SimpleCouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository extends SimpleCouchbaseRepository<Customer, String> {


    public CustomerRepository(CouchbaseEntityInformation<Customer, String> entityInformation,
                              CouchbaseOperations couchbaseOperations, Class<?> repositoryInterface) {
        super(entityInformation, couchbaseOperations, repositoryInterface);
    }
}
