package com.somanager.springmongodbapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppStatusController {



    @GetMapping(path = "/api/status")
    public String checkStatus(){
        return "Online";
    }

}
