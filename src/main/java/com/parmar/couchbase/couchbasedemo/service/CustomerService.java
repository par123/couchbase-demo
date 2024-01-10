package com.parmar.couchbase.couchbasedemo.service;


public interface CustomerService<T> {
    T save(T t);
    T get(String id);
    T update(T t);
}
