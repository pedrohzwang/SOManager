package com.somanager.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.somanager.springapp.model.ServiceOrderModel;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceOrderRepository extends JpaRepository<ServiceOrderModel, Integer> {

}
