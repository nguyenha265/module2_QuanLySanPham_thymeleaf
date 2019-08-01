package com.codegym.service;

import com.codegym.model.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer,Customer> arrayList = new HashMap();

    static {
        arrayList.put(1,new Customer(1, "John", "john@codegym.vn", "Hanoi"));
        arrayList.put(2,new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        arrayList.put(3,new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        arrayList.put(4,new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        arrayList.put(5,new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        arrayList.put(6,new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));
    }


    @Override
    public Map<Integer,Customer> findAll() {
        return arrayList;
    }

    @Override
    public void save(Integer id,Customer customer) {
        arrayList. put(id,customer);
    }

    @Override
    public Customer findById(Integer id) {
        return arrayList.get(id);
    }

    @Override
    public void update(Integer id, Customer customer) {
        arrayList.put(id, customer);
    }

    @Override
    public void remove(Integer id) {
        arrayList.remove(id);
    }
}
