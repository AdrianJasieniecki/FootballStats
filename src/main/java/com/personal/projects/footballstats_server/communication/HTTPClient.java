package com.personal.projects.footballstats_server.communication;

import com.personal.projects.footballstats_server.dtos.AbstractDTO;
import com.personal.projects.footballstats_server.dtos.CountryDTO;
import com.personal.projects.footballstats_server.dtos.LeagueDTO;
import com.personal.projects.footballstats_server.management.ResponseHandler;
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
    private final RestClient defaultRestClient;
//    @Value("${api.key}")
    private final String apiKey = "12bda414abaac6d2698c8d2ebbb44789";
    private final String apiName = "x-rapidapi-key";

    public HTTPClient(ResponseHandler responseHandler) {
        this.responseHandler = responseHandler;
        this.defaultRestClient = RestClient.create();
    }

    public void performRequestForCountries(String method) {
        Resp<List<Map<String, String>>> resp = defaultRestClient.get()
                .uri(String.format("%s/%s", url, method))
                .header(apiName, apiKey)
                .retrieve()
                .body(Resp.class);
        if (resp != null) {
            List<Map<String, String>> responseList = resp.getResponse();
            for (Map<String, String> responseMap : responseList) {
                AbstractDTO countryDTO = new CountryDTO()
                        .setName(responseMap.get("name"))
                        .setCode(responseMap.get("code"))
                        .setFlagURL(responseMap.get("flag"));
                sendResponseToHandler(countryDTO, method);
            }
        }
    }

    public void performRequestForLeagues(String method) {
        Resp<List<Map<String, Map<String, String>>>> resp = defaultRestClient.get()
                .uri(String.format("%s/%s", url, method))
                .header(apiName, apiKey)
                .retrieve()
                .body(Resp.class);
        if (resp != null) {
            List<Map<String, Map<String, String>>> responseList = resp.getResponse();
            for (Map<String, Map<String, String>> responseMap : responseList) {
                AbstractDTO leagueDTO = createLeagueDTO(responseMap);
                sendResponseToHandler(leagueDTO, method);
            }
        }
    }

    public void sendResponseToHandler(AbstractDTO dto, String method) {
        responseHandler.handleResponse(method, dto);
    }

    private LeagueDTO createLeagueDTO (Map<String, Map<String, String>> responseMap) {
        CountryDTO countryDTO = new CountryDTO()
                .setCode(responseMap.get("country").get("code"))
                .setName(responseMap.get("country").get("name"))
                .setFlagURL(responseMap.get("country").get("flag"));
        return new LeagueDTO()
                .setCountryDTO(countryDTO)
                .setType(responseMap.get("league").get("type"))
                .setName(responseMap.get("league").get("name"))
                .setLogoURL(responseMap.get("league").get("logo"));
    }
}
