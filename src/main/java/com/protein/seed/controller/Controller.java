package com.protein.seed.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seed")
public class Controller {

    /**
     * This method handles the GET request to "/" endpoint.
     *
     * @return A string containing the welcome message.
     * @Author Zeeshan Shaikh
     */
    @Operation(summary = "get hello message here")
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return "hello seed!";
    }
}
