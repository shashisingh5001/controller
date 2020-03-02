package com.springfirst.service;

import com.springfirst.dto.Customer;
import com.springfirst.repository.TestRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class TestService {

    @Autowired
     private TestRepository testRepository;



    public List<Customer> getHelloWorld() {
        log.info("Inside Service");
        return testRepository.getCustomers();
    }

    public void addCustomerService( Customer customer){

         testRepository.addCustomer(customer);

    }
}
