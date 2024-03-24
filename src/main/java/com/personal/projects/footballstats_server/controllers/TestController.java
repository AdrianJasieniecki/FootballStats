package com.personal.projects.footballstats_server.controllers;

import com.personal.projects.footballstats_server.communication.HTTPClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public void testCode() {
        HTTPClient httpClient = new HTTPClient();
        httpClient.performRequestForCountries("countries");
    }
}
