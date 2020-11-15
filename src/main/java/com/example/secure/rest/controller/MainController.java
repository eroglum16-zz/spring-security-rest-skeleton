package com.example.secure.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(MainController.BASE_URL)
public class MainController {
    public static final String BASE_URL = "/api/v1";

    @GetMapping
    public ResponseEntity getInfo(){
        return new ResponseEntity("Very important information.", HttpStatus.OK);
    }
}
