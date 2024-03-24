package com.personal.projects.footballstats_server.management;

import com.personal.projects.footballstats_server.dtos.CountryDTO;
import com.personal.projects.footballstats_server.mappers.CountryMapper;
import com.personal.projects.footballstats_server.models.CountryModel;
import com.personal.projects.footballstats_server.services.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

import static com.personal.projects.footballstats_server.configuration.Constants.COUNTRIES_ENDPOINT;

@Component
public class ResponseHandler {

    Logger logger = LoggerFactory.getLogger(ResponseHandler.class);

    private final CountryService countryService;

    public ResponseHandler(CountryService countryService) {
        this.countryService = countryService;
    }

    public void handleResponse(String method, List<Map<String, String>> response) {
        switch (method) {
            case COUNTRIES_ENDPOINT: {
                handleCountriesResponse(response);
            }
        }
    }

    private void handleCountriesResponse(List<Map<String, String>> response) {
        CountryMapper countryMapper = new CountryMapper();
        for (Map<String, String> responseMap : response) {
            String name = responseMap.get("name");
            String code = responseMap.get("code");
            String flag = responseMap.get("flag");
            logger.info("name = " + name + ", code = " + code + ", flag = " + flag);
            CountryDTO countryDTO = new CountryDTO()
                    .setName(name)
                    .setCode(code)
                    .setFlagURL(flag);
            CountryModel countryModel = countryMapper.toEntity(countryDTO);
            if (countryService.addNewCountry(countryModel) != null) {
                logger.info("success = " + countryModel);
            }
        }
    }
}
