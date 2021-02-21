package com.somanager.springapp.service;

import com.somanager.springapp.model.ServiceOrderModel;
import com.somanager.springapp.repository.ServiceOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    public Optional<ServiceOrderModel> findByNumber(Integer number){
        return repository.findById(number);
    }

    /*public Optional<ServiceOrderModel> findByUser(String user){
        return repository.exists()
    }*/
}
