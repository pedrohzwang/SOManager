package com.somanager.springmongodbapp.repository;

import com.somanager.springmongodbapp.model.ServiceOrderModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceOrderRepository extends MongoRepository<ServiceOrderModel, Integer> {

}
