package com.somanager.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.somanager.springapp.model.ServiceOrderModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceOrderRepository extends JpaRepository<ServiceOrderModel, Integer> {

    @Query(value = "SELECT * FROM service_order WHERE user = ?1", nativeQuery = true)
    List<ServiceOrderModel> findByUser(String user);

    @Query(value = "SELECT * FROM service_order WHERE number = ?1", nativeQuery = true)
    ServiceOrderModel findByNumber(Integer number);
}
