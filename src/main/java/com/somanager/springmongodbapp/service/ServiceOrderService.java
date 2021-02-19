package com.somanager.springmongodbapp.service;

import com.somanager.springmongodbapp.model.ServiceOrderModel;
import com.somanager.springmongodbapp.repository.ServiceOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOrderService {

    @Autowired
    private ServiceOrderRepository repository;

    public List<ServiceOrderModel> findAll(){
        return repository.findAll();
    }
}
