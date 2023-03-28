package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("WELCOME TO FINTECH CSI");
    }
    @GetMapping("/services")
    public ResponseEntity<String> sayServices(){
        return ResponseEntity.ok("SOFTWARE DEVELOPMENT ");
    }
    @GetMapping("address")
    public ResponseEntity<String> SayAddress(){
        return ResponseEntity.ok("INDIA  |  PUNE");
    }


}
