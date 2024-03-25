package com.personal.projects.footballstats_server.controllers;

import com.personal.projects.footballstats_server.communication.HTTPClient;
import com.personal.projects.footballstats_server.management.ResponseHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.personal.projects.footballstats_server.configuration.Constants.COUNTRIES_ENDPOINT;

@RestController
public class TestController {

    private final ResponseHandler responseHandler;

    public TestController(ResponseHandler responseHandler) {
        this.responseHandler = responseHandler;
    }

    @GetMapping("/")
    public void testCode() {
//        HTTPClient httpClient = new HTTPClient(responseHandler);
//        httpClient.performRequestForCountries(COUNTRIES_ENDPOINT);
    }
}
