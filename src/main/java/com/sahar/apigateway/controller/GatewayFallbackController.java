package com.sahar.apigateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class GatewayFallbackController {

    @GetMapping("/user-management")
    public String userManagementFallback() {
        return "User Management Service is currently unavailable. Please try again later.";
    }
}