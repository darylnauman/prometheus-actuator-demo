package com.ex.prometheusactuatordemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String greeting() { return "Hello! This is a very simple app to demo actuator and prometheus."; }
}
