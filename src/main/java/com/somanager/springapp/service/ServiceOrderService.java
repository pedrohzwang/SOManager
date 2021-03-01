package com.somanager.springapp.service;

import com.somanager.springapp.model.ServiceOrderModel;
import com.somanager.springapp.repository.ServiceOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceOrderService {

    @Autowired
    private ServiceOrderRepository repository;

    public List<ServiceOrderModel> findAll(){
        return repository.findAll();
    }

    public ServiceOrderModel save(ServiceOrderModel so){
        return repository.save(so);
    }

    public ServiceOrderModel findByNumber(Integer number){
        return repository.findByNumber(number);
    }

    public ResponseEntity<Void> deleteServiceOrder(Integer number){
        repository.deleteById(number);
        return ResponseEntity.noContent().build();
    }

    public ResponseEntity<Void> deleteAllServiceOrder(){
        repository.deleteAll();
        return ResponseEntity.noContent().build();
    }

    public List<ServiceOrderModel> findByUser(String user){
        return repository.findByUser(user);
    }

    public ServiceOrderModel updateSO(ServiceOrderModel newSO){
        ServiceOrderModel serviceOrder = findByNumber(newSO.getNumber());
        updateData(serviceOrder, newSO);
        return repository.save(serviceOrder);
    }

    private void updateData(ServiceOrderModel serviceOrder, ServiceOrderModel newSO) {
        serviceOrder.setDescription(newSO.getDescription());
        serviceOrder.setDate(newSO.getDate());
        serviceOrder.setUser(newSO.getUser());
    }



}
