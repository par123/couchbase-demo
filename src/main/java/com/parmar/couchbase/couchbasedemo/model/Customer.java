package com.parmar.couchbase.couchbasedemo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

@Data
@Document
public class Customer {

    @Id
    String id;
    @Field
    String name;
    @Field
    String address;
    @Field
    int age;

}
