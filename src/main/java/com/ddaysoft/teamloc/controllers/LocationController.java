package com.ddaysoft.teamloc.controllers;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@RequestMapping("locations")
@RestController
public class LocationController {

    @GetMapping("test")
    public String getMethodName(@RequestParam String param) {
        log.info(param);
        return new String("hello");
    }

    @PostMapping
    public void postLocation(@RequestBody String locationJson){
        log.info(locationJson);
    }
    
}
