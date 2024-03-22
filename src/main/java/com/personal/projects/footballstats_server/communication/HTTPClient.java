package com.personal.projects.footballstats_server.communication;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestClient;

public class HTTPClient {

    private String url = "https://v3.football.api-sports.io";
    private RestClient defaultRestClient;
    @Value("${api.key}")
    private String apiKey;

    public HTTPClient() {
        this.defaultRestClient = RestClient.create();
    }

    public void performRequestForCountries() {
        Response response = defaultRestClient.get()
                .uri(String.format("%s/countries", url))
                .retrieve()
                .body(Response.class);


    }
}
