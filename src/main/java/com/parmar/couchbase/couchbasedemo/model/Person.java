package com.parmar.couchbase.couchbasedemo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String name;
    private String address;
    private Long phone;
}
