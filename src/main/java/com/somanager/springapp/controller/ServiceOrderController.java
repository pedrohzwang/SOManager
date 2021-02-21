package com.somanager.springapp.controller;

import com.somanager.springapp.model.ServiceOrderModel;
import com.somanager.springapp.service.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/service-order")
public class ServiceOrderController {

    @Autowired
    private ServiceOrderService service;

    @GetMapping
    public List<ServiceOrderModel> findAll(){
        return service.findAll();
    }

    @PostMapping
    public ServiceOrderModel add(@RequestBody ServiceOrderModel so){
        return service.save(so);
    }

    @GetMapping(path = "/{number}")
    public Optional<ServiceOrderModel> findByNumber(@PathVariable("number") Integer number){
        return service.findByNumber(number);
    }
}
