package com.somanager.springmongodbapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@NoArgsConstructor

@Document(collection = "service_order")
public class ServiceOrderModel {

    @Id
    private Integer number;
    private String description;
    private String date;
    private String user;
}
