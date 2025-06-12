package com.bookMyShow.bookMyShow.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController("/health")
@RestController
public class HealtheController
{


    @GetMapping("/health")
    public  String checkHealthe(){
        return "Sub Changa si!!";
    }
}
