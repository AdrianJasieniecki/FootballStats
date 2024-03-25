package com.personal.projects.footballstats_server.management;

import com.personal.projects.footballstats_server.dtos.AbstractDTO;
import com.personal.projects.footballstats_server.dtos.CountryDTO;
import com.personal.projects.footballstats_server.dtos.LeagueDTO;
import com.personal.projects.footballstats_server.mappers.CountryMapper;
import com.personal.projects.footballstats_server.mappers.LeagueMapper;
import com.personal.projects.footballstats_server.models.CountryModel;
import com.personal.projects.footballstats_server.models.LeagueModel;
import com.personal.projects.footballstats_server.services.CountryService;
import com.personal.projects.footballstats_server.services.LeagueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import static com.personal.projects.footballstats_server.configuration.Constants.*;

@Component
public class ResponseHandler {

    Logger logger = LoggerFactory.getLogger(ResponseHandler.class);

    private final CountryService countryService;
    private final LeagueService leagueService;

    public ResponseHandler(CountryService countryService, LeagueService leagueService) {
        this.countryService = countryService;
        this.leagueService = leagueService;
    }

    public void handleResponse(String method, AbstractDTO dto) {
        switch (method) {
            case COUNTRIES_ENDPOINT -> handleCountriesResponse((CountryDTO) dto);
            case LEAGUES_ENDPOINT -> handleLeaguesResponse((LeagueDTO) dto);
            default -> throw new IllegalStateException("Unexpected value: " + method);
        }
    }

    private void handleCountriesResponse(CountryDTO dto) {
        CountryMapper countryMapper = new CountryMapper();
        CountryModel countryModel = countryMapper.toEntity(dto);
        if (countryService.addNewCountry(countryModel) != null) {
            logger.info("success = " + countryModel);
        }
    }

    private void handleLeaguesResponse(LeagueDTO dto) {
        LeagueMapper leagueMapper = new LeagueMapper();
        LeagueModel leagueModel = leagueMapper.toEntity(dto);
        leagueModel.setCountry(countryService.getCountryByName(dto.getCountryDTO().getName()));
        if (leagueService.addNewLeague(leagueModel) != null) {
            logger.info("success = " + leagueModel);
        }
    }
}
