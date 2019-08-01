package com.codegym.service;

import com.codegym.model.Customer;

import java.util.Map;

public interface CustomerService {
    Map<Integer,Customer> findAll();

    void save(Integer id,Customer customer);

    Customer findById(Integer id);

    void update(Integer id, Customer customer);

    void remove(Integer id);
}
