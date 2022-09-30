package com.example.demo.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Boban Djordjevic"),
                new Customer(2L, "Sinisa Mihajlovic"),
                new Customer(3L, "Ibrahim Cutlay")
        );
    }
}
