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
    public List<ServiceOrderModel> findAll(){
        return service.findAll();
    }

    @PostMapping
    public ServiceOrderModel addSO(@RequestBody ServiceOrderModel so){
        return service.save(so);
    }

    @GetMapping(path = "/{number}")
    public ServiceOrderModel findByNumber(@PathVariable("number") Integer number){
        return service.findByNumber(number);
    }

    @DeleteMapping(path = "/delete")
    public void deleteAllSO(){
        service.deleteAllServiceOrder();
    }

    @DeleteMapping(path = "/delete/{number}")
    public void deleteSO(@PathVariable("number") Integer number){
        service.deleteServiceOrder(number);
    }

    @GetMapping(path = "/findByUser/{user}")
    public ResponseEntity<List<ServiceOrderModel>> findSOByUser(@PathVariable("user") String user){
        return ResponseEntity.ok(service.findByUser(user));
    }

    @PutMapping(path = "/update/{number}")
    public ResponseEntity<Void> updateSO(@RequestBody ServiceOrderModel newSO, @PathVariable("number") Integer number){
        ServiceOrderModel serviceOrder = service.updateSO(newSO);
        return ResponseEntity.noContent().build();
    }
}
