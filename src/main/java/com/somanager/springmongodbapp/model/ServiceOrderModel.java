package com.somanager.springmongodbapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class ServiceOrderModel {

    private Integer number;
    private String description;
    private Date date;
    private String user;
}
