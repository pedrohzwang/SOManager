package com.somanager.springmongodbapp.controller;

import com.somanager.springmongodbapp.model.ServiceOrderModel;
import com.somanager.springmongodbapp.service.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceOrderController {

    @Autowired
    private ServiceOrderService service;

    @GetMapping(path = "/all")
    public ResponseEntity<List<ServiceOrderModel>> findAll(){
        List<ServiceOrderModel> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
