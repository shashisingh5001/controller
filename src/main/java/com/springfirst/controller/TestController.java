package com.springfirst.controller;

import com.springfirst.dto.Customer;
import com.springfirst.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@Slf4j
public class TestController {



    @Autowired
    private TestService testService;

    @GetMapping("/get")
    public List<Customer> helloworld(){

        log.info("Inside Controller");

        return testService.getHelloWorld();

    }

     @PostMapping("/submit")

    public void addCustomer(@RequestBody Customer customer){
        log.info("Inside Controller submit");testService.addCustomerService(customer);}


}
