package com.parmar.couchbase.couchbasedemo.service;

import com.parmar.couchbase.couchbasedemo.model.Person;

public class PersonServiceImpl implements PersonService{
    @Override
    public void speak() {
        Person person = Person.builder().name("Ram").address("patna").phone(145L).build();
        
    }

    @Override
    public void solve() {

    }
}
