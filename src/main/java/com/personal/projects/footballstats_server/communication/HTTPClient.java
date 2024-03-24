package com.personal.projects.footballstats_server.communication;

import com.personal.projects.footballstats_server.management.ResponseHandler;
import com.personal.projects.footballstats_server.services.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;
import java.util.Map;

@Component
public class HTTPClient {
    Logger logger = LoggerFactory.getLogger(HTTPClient.class);
    private final ResponseHandler responseHandler;
    private final String url = "https://v3.football.api-sports.io";
    private RestClient defaultRestClient;
//    @Value("${api.key}")
    private final String apiKey = "12bda414abaac6d2698c8d2ebbb44789";
    private final String apiName = "x-rapidapi-key";

    public HTTPClient(ResponseHandler responseHandler) {
        this.responseHandler = responseHandler;
        this.defaultRestClient = RestClient.create();
    }

    public void performRequestForCountries(String method) {
        Resp resp = defaultRestClient.get()
                .uri(String.format("%s/%s", url, method))
                .header(apiName, apiKey)
                .retrieve()
                .body(Resp.class);
        if (resp != null) {
            List<Map<String, String>> responseList = resp.getResponse();
            sendResponseToService(responseList, method);
        }
    }

    public void sendResponseToService(List<Map<String, String>> response, String method) {
        responseHandler.handleResponse(method, response);
    }
}
