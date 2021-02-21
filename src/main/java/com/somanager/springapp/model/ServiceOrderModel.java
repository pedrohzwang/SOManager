package com.somanager.springapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor

@Entity(name = "service_order")
public class ServiceOrderModel {

    @Id
    private Integer number;
    @Column(nullable = false, length = 200)
    private String description;
    @Column(nullable = false, length = 45)
    private String date;
    @Column(nullable = false, length = 50)
    private String user;
}
