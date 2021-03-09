package com.somanager.springapp.controller;

import com.somanager.springapp.model.ServiceOrderModel;
import com.somanager.springapp.service.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/service-order")
public class ServiceOrderController {

    @Autowired
    private ServiceOrderService service;

    @GetMapping
    public ResponseEntity<List<ServiceOrderModel>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<ServiceOrderModel> addSO(@RequestBody ServiceOrderModel so){
        return ResponseEntity.ok(service.save(so));
    }

    @GetMapping(path = "/{number}")
    public ResponseEntity<ServiceOrderModel> findByNumber(@PathVariable("number") Integer number){
        return ResponseEntity.ok(service.findByNumber(number));
    }

    @DeleteMapping(path = "/delete")
    public ResponseEntity<Void> deleteAllSO(){
        service.deleteAllServiceOrder();
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/delete/{number}")
    public ResponseEntity<Void> deleteSO(@PathVariable("number") Integer number){
        service.deleteServiceOrder(number);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(path = "/findByUser/{user}")
    public ResponseEntity<List<ServiceOrderModel>> findSOByUser(@PathVariable("user") String user){
        return ResponseEntity.ok(service.findByUser(user));
    }

    @PutMapping(path = "/update/{number}")
    public ResponseEntity<Void> updateSO(@RequestBody ServiceOrderModel newSO, @PathVariable("number") Integer number){
        service.updateSO(newSO);
        return ResponseEntity.noContent().build();
    }
}
